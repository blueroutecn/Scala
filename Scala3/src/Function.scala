/**
  * Created by 54675 on 2016/11/10.
  */
object Function {
  def main(args: Array[String]): Unit = {
    var increase = (x:Int) => x + 1
    println(increase(10))
    increase = (x:Int) => x + 999
    val someNumbers = List(-11,-10,-5,0,5,10)
    someNumbers.foreach((x:Int) => print(x+" "))
    println()
    someNumbers.filter((x:Int) => x > 0).foreach((x:Int) => print(x+" "))
    println()
    someNumbers.filter((x) => x > 0).foreach((x:Int) => print(x+" "))
    println()
    someNumbers.filter(x => x > 0).foreach((x:Int) => print(x+" "))
    println()
    someNumbers.filter(_ > 0).foreach((x:Int) => print(x+" "))
    println()
  }
}
