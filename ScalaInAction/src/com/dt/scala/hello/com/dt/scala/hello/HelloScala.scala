package com.dt.scala.hello.com.dt.scala.hello

/**
  * Created by 54675 on 2016/11/2.
  */
object HelloScala {

  def main(args:Array[String]): Unit ={
    print(if(! args.isEmpty) args(0) else "in.txt")
//    println("HelloScala!!!")
//    for(arg<-args){
//      println(arg)
//    }
  }
}
