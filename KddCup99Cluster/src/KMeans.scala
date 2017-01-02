/**
  * Created by 54675 on 2016/11/25.
  */
import breeze.linalg.{Vector, DenseVector, squaredDistance}
import org.apache.spark.{SparkConf, SparkContext}
import java.io._

object KMeans {
  def parseVector(line: String): Vector[Double] = {//开始以string读入，解析向量为vector
    DenseVector(line.split(' ').map(_.toDouble))//向量就是一维数组
  }

  def closestPoint(p: Vector[Double], centers: Array[Vector[Double]]): Int = {//求某个点的最近点
    var bestIndex = 0
    var closest = Double.PositiveInfinity//初始值是正无穷

    for (i <- 0 until centers.length) {//array下标从0开始
      val tempDist = squaredDistance(p, centers(i))
      if (tempDist < closest) {
        closest = tempDist
        bestIndex = i
      }
    }
    bestIndex
  }

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("KMeans")
    val sc = new SparkContext(sparkConf)
    //读取数据
    val lines = sc.textFile("file:///root/kddcup99-data/kdd10%")//文件来源
    val data = lines.map(parseVector _).cache()//待处理数据data是5万个向量，固化到缓存中
    //设置相关参数
    val K = 23//K值
    val convergeDist = 0.1.toDouble//收敛距离
    val kPoints = data.takeSample(false, K, 3)//初始点,KPoints是array
    var tempDist = Double.PositiveInfinity//当前距离
    //开始迭代
    while(tempDist > convergeDist) {//当前距离大于收敛距离，则继续迭代
      val closest = data.map (p => (closestPoint(p, kPoints), (p, 1)))//找各个向量的最近点，得到（该点最近点编号，（该点向量，1））
      val close2 = closest.map{p => p._1}
      val pointStats = closest.reduceByKey{case ((p1, c1), (p2, c2)) => (p1 + p2, c1 + c2)}//得到（编号，（属于该编号的点向量和，属于该编号的点的数目））
      val newPoints = pointStats.map {pair =>(pair._1, pair._2._1 * (1.0 / pair._2._2))}.collectAsMap()//求出各个划分的新均值点，得到（编号，最近点向量和均值）
//      for((value1,value2) <- newPoints)
//        println("-----------------"+value1+"--------"+value2+"----------")
      tempDist = 0.0
      for (i <- 0 until K) {//k个点的欧式距离的和
        if(newPoints.contains(i))
          tempDist += squaredDistance(kPoints(i), newPoints(i))
      }
      println("-----------------1------------------")
      for (newP <- newPoints) {//更新均值点
        kPoints(newP._1) = newP._2
      }
      println("-----------------2------------------")
      if(tempDist < convergeDist){//跳出，写文件
        closest.saveAsTextFile("file:///root/kddcup99-data/kdd10%_kmeans")
      }
      println("Finished iteration (delta = " + tempDist + ")")
    }
  }
}