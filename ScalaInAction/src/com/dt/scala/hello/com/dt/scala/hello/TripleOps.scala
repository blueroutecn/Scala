package com.dt.scala.hello.com.dt.scala.hello

/**
  * Created by 54675 on 2016/11/7.
  */
object TripleOps {
  def main(args: Array[String]): Unit = {
    val triple = (100,"Scala","Spark")
    println(triple._1)
    println(triple._2)
    println(triple._3)
    val (one,two,three) = triple
    val onee,twoo,_ = triple
    print(one+" "+two+" "+three)
    print(onee+" "+twoo)
  }
}