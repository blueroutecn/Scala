/**
  * Created by 54675 on 2016/11/9.
  */
class Outer(val name:String){ outer=>
  class Inner(val name:String){
    def foo(b:Outer#Inner) = println("Outer:"+outer.name+" Inner:"+b.name)
  }
}
object OOPInScala3 {
  def main(args: Array[String]): Unit = {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Scala")
    val inner1 = new outer1.Inner("Hadoop")
    val inner2 = new outer2.Inner("Java")
    inner1.foo(inner2)
    inner2.foo(inner1)
  }
}
