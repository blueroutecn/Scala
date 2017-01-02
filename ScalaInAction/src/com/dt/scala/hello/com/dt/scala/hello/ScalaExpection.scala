package com.dt.scala.hello.com.dt.scala.hello
import scala.io.Source

object ScalaExpection {
  def main(args: Array[String]): Unit = {
    val n = 99;
    val file = Source.fromFile("C:\\Users\\54675\\Desktop\\近期竞赛\\1.txt")
    try{
//      println(file)
      val half = if(n %2 == 0) n/2 else throw
        new RuntimeException("N must be event")
    }catch{
      case e:RuntimeException=>println("The exception is:"+e.getMessage)
    }finally{file.close()}
  }
}
