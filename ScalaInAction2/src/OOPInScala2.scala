/**
  * Created by 54675 on 2016/11/9.
  */
class Teacher2(val name:String,val age:Int){
  println("This is the primary constructor!!")
  var gender:String = _
  println(gender)
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }
}
object OOPInScala2{
  def main(args: Array[String]): Unit = {
    val p = new Teacher2("Spark",5)
    println(":"+p.age)
  }
}
