package com.dt.scala.hello.com.dt.scala.hello

/**
  * Created by 54675 on 2016/11/2.
  */
object ScalaBasics {
  case class Person(name:String,isMale:Boolean,children:Person*)
  def main(args: Array[String]): Unit = {
    val rocky = Person("Rocky",true)
    val lauren = Person("Lauren",false,rocky)
    val vivian = Person("Vivian",false,lauren,rocky)
    val persons = List(lauren,rocky,vivian)
    val forresults = for{person<-persons;if ! person.isMale;name = person.name;child<-person.children}
    yield(person.name,child.name)
    println(forresults)
  }
}
