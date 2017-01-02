/**
  * Created by 54675 on 2016/11/9.
  */
class Person{
  private var age = 0
  def increment(){age += 1}
  def current = age
  def act(person:Person){}
}
class Student{
  private var privateAge = 0
  var name = "Scala"
  def age = privateAge
  def isYounger(other:Student) = privateAge < other.privateAge
}
object HelloOOP {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)
    val student = new Student
    student.name = "spark"
    println(student.name)
  }
}
