package com.knoldus.Calculator


object CalcImpl{
  def main(args: Array[String]): Unit = {
    val calculator = new Calculator()
    println("Addition: " + calculator.Addition(20 ,30))
    println("Subtraction: "+calculator.Subtraction(50 , 10))
    println("Multiple: " + calculator.Multiply(30,10))
    println("Division: " + calculator.Divide(20,5))
    println("Power: " + calculator.power(2,4))
    println("Absolute: " + calculator.Absolute(-47))
    println("Modulus: " + calculator.Modulus(50,30))
    println("Maximum: " + calculator.Maximum(20,56))
    println("Minimum: " + calculator.Minimum(-20 , 30))

  }
}
