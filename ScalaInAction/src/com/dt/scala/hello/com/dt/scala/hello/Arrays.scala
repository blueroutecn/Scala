package com.dt.scala.hello.com.dt.scala.hello
import scala.collection.mutable.ArrayBuffer
/**
  * Created by 54675 on 2016/11/7.
  */
object Arrays {
  def main(args: Array[String]): Unit = {
    val b = ArrayBuffer[Int]()
    b += 1
    b += (1,2,3,4)
    b ++= Array(8,13,21)
    Array(1,2,3)
  }
}