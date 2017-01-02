/**
  * Created by 54675 on 2016/11/9.
  */
import scala.collection.mutable.ArrayBuffer
class Company{
  class Staff(val name:String){
    val contacts = new ArrayBuffer[Company#Staff]
  }
  val Staffs = new ArrayBuffer[Staff]
  def join(name:String) = {
    val s = new Staff(name)
    Staffs += s
    s
  }
}
object OOPInScala4 {
  def main(args: Array[String]): Unit = {
    val myFacebook = new Company
    val myTwitter = new Company
    val staff1_myFacebook = myFacebook.join("staff1_myFacebook")
    val staff2_myFacebook = myFacebook.join("staff2_myFacebook")
    val staff1_myTwitter = myTwitter.join("staff1_myTwitter")
    val staff2_myTwitter = myTwitter.join("staff2_myTwitter")
    staff1_myFacebook.contacts += staff2_myFacebook
    staff1_myFacebook.contacts += staff1_myTwitter
//  for(elem <- myFacebook.Staffs) println(elem.name)
    for(elem <- myFacebook.Staffs;elem2 <- elem.contacts) println(elem.name+" "+elem2.name)

  }
}
