/**
  * Created by 54675 on 2016/11/9.
  */
class Person1(val name:String,var age:Int){
  println("The primary constructor of Person")
  val school = "sdust"
  def sleep  = "8 hours"
  override def toString = "I am a Person!"
}
class Worker(name:String,age:Int,val salary:Long) extends Person1(name,age){
  override val school = "Spark"

  override def toString: String = "I am a worker!"+super.sleep
}
object OverrideOperations {
  def main(args: Array[String]): Unit = {
    val w = new Worker("Spark",5,10000)
    println("School:"+w.school)
    println("Salary:"+w.salary)
    println(w.toString)
  }
}
