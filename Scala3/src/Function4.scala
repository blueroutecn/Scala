/**
  * Created by 54675 on 2016/11/15.
  */
object Function4 {
  def multipleOne(x:Int) = (y:Int) =>x * y
  def main(args: Array[String]): Unit = {
    print(multipleOne(6)(7))
  }
}
