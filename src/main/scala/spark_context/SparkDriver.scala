package spark_context

import org.apache.spark.{SparkConf, SparkContext}

object SparkDriver {
  
  def disableLog(): Unit = {
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)
  }

  def main(args: Array[String]): Unit = {
    disableLog()

    var conf = new SparkConf().setAppName("Spark Driver").setMaster("local")

    var sc = new SparkContext(conf)


    var rdd = sc.makeRDD(Array(1,2,3,4,5,6))
    var c = rdd.count()

    println("count = " + c)

  }
}
