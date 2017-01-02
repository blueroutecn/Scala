/* SimpleApp.scala */
package com.cloudyhadoop.spark.app
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "hdfs://localhost:9000/user/test.txt" // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application").setMaster("spark://localhost:7077")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile)
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
    sc.stop()
  }
}