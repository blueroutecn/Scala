/**
  * Created by 54675 on 2016/11/10.
  */

object Fuction2 {
  def main(args: Array[String]): Unit = {
    def suum(a:Int,b:Int,c:Int) = a + b + c
//    val fp_a  = suum_
//    println(fp_a(1,2,3))
    val fp_b = suum(1,_:Int,3)
    print(fp_b(2))
  }
}