package com.dt.scala.hello.com.dt.scala
import scala.io.Source
/**
  * Created by 54675 on 2016/11/2.
  */
object ReadFile {
  def main(args:Array[String]): Unit ={
    val Files = (new java.io.File("C:\\windows\\system32")).listFiles()
    for(file <- Files)
      println(file)
  }
}
