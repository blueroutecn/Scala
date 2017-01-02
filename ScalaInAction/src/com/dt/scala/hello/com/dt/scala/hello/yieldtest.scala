package com.dt.scala.hello.com.dt.scala.hello

/**
  * Created by 54675 on 2016/11/2.
  */
object yieldtest {
  def main(args:Array[String]): Unit ={
    val nums = List(1,2,3,4)
    val yieldresults = for(num <- nums) yield{
      println("这个数字为："+num)
      (num,num*10,num*100)
    }
    println(yieldresults)
  }
}
