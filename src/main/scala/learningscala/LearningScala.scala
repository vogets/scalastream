package com.sameer.stream
package learningscala

object LearningScala {



  def main(args: Array[String]) {
    println("Hello World")
    val hello:String="Merci"
    println(hello)
    val re = """.* ([\d]+).*+""".r
    val asses : String = "Details is in 21"
    val re(answer) = asses
    println(answer.toInt)
    val isGreater = 1>2
    val isLesser=1<2
    println(isGreater)
    println(isLesser)
  }
}
