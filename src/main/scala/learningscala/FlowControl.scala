package com.sameer.stream
package learningscala

object FlowControl {

  def main(args:Array[String])
  {
    if(1<2)
      {
        println("true")
      }
    else
      {
        println("false")
      }

    val value=3
value match
  {
  case 1 => println("First")
  case 3 => println("Third")
}
    for(i <- 1 to 5) {
      val squared=i * i
      println(squared)
    }

  }

}
