package lz.test.spark

import org.apache.spark.{SparkConf, SparkContext}

/**
  * @author 万二(Zheng Liu) 
  */
object SparkApp {

  def main(args: Array[String]): Unit = {

    println("hehhda")

    val conf: SparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("test-spark")
      .set("spark.driver.host", "localhost")

    val sc: SparkContext = new SparkContext(conf)

    val dataArr = Array(1, 4, 6, 4)

    val rddDraft = sc.parallelize(dataArr)

    val count = rddDraft.map(x => (x, 1))
      .reduceByKey((x, y) => x + y)
      .collect()

    val sum = rddDraft.reduce((x, y) => x + y)

    println("count is " + count.apply(0).toString())

    println("sum is " + sum)

    val end = 1

  }

}
