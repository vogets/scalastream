package com.sameer.stream

import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args:Array[String]): Unit =
  {
    //setup a sparkcontext and sparkconf
    val conf=new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc=new SparkContext(conf)
    //specify the input oath to read from and create RDD
    val input=sc.textFile("/home/svogeti/Documents/twitterstream/src/main/scala/book.txt")
    //split the RDD based on the delimiter
    val words=input.flatMap(line =>line.split(' '))
    //Convert the Words to Lower Cases
    val lowerCaseWords=words.map(word=>word.toLowerCase)
    //Count the unique words by value
    val wordCounts=lowerCaseWords.countByValue()
    //take the first 20 words and their counts
    val sample=wordCounts.take(20)
    //print in key value pairs
    for((word,count)<-sample)
      {
        println(word+" : "+count)
      }
  }

}
