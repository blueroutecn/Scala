import breeze.linalg.DenseVector

/**
  * Created by 54675 on 2016/11/25.
  */
object test {
  def main(args: Array[String]): Unit = {
    val v = DenseVector(0,1,22,9,181,5450,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,8,8,0.00,0.00,0.00,0.00,1.00,0.00,0.00,9,9,1.00,0.00,0.11,0.00,0.00,0.00,0.00,0.00)
    val v2 = v + v
    println(v2)
    val now = v2 * (1.0/12)
    println(now)
  }
}
