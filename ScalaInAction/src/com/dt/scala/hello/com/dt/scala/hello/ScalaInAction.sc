val greetingstring = "hellospark"
var greetingstring2 = "hellospark"
println(greetingstring)
println(greetingstring2)
1+2
100+"spark"



Looper(11,2)
def Looper(x:Long,y:Long):Long={
  var a = x
  val b = y
  while(a != 0){
    a = a%b
    println(a)
  }
  a
}
Looper(10,2)
//val args = {"xiaozhang" "xiaoli" "xiaogong"};
//for(arg<-args){
//  println(arg)
//}
val nums = new Array[Int](10)
val a = new Array[String](10)
val s = Array("Hello","World")
s(0) = "Goodbye"
