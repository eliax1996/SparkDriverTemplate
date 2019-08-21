package spark_context

import org.apache.spark.{SparkConf, SparkContext}

object SparkDriver {
  def main(args: Array[String]): Unit = {
    println("ciao")

    var conf = new SparkConf().setAppName("Spark Driver").setMaster("local")

    var sc = new SparkContext(conf)


    var rdd = sc.makeRDD(Array(1,2,3,4,5,6))
    var c = rdd.count()

    println("count = " + c)

    println("ciao mondooooo o mia bella madunina")

  }
}