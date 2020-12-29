package com.sameer.stream
package learningscala

object Functions {

  def squareIT(x:Int):Int={
    x*x
  } //In functional Programming, we can pass in another function as a parameter to the main function
  def transform(x:Int,f:Int=>Int):Int={
    f(x)
  }

  def main(args:Array[String]): Unit =
  {
    println(squareIT(5))
    println(transform(3,squareIT))
    //we can do it for inline functions
    println(transform(5,x=>x*x*x))
    println(transform(10,x=>x/2))

  }

}
