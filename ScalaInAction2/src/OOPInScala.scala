/**
  * Created by 54675 on 2016/11/9.
  */
class Teacher{
  var name:String=_
  private var age = 27
  private[this] val gender = 27
  def this(name:String){
    this
    this.name = name
  }
  def sayHello(): Unit ={
    println(this.name+":"+this.age+":"+this.gender)
  }
}
object OOPInScala {
  def main(args: Array[String]): Unit = {
    val p = new Teacher()
    p.name = "Spark"
    p.sayHello()
  }
}