package com.knoldus.Calculator

class Calculator {
  // Method for addition
  def Addition(number1: Int, number2: Int): Int = number1 + number2

  // Method for subtraction
  def Subtraction(number1: Int, number2: Int): Int = number1 - number2

  // Method for Multiplication
  def Multiply(number1: Int, number2: Int):Int =number1 * number2

  // Method for Division
  def Divide(number1: Int, number2: Int): Int = {
    {
      require(number2 != 0, "denominator can not be 0")
      number1 / number2
    }
  }

  //Method for find the power of any number
  def power(number1: Int, number2: Int): Double = Math.pow(number1,number2)

  //Method for find Absolute number
  def Absolute(number:Int):Int = Math.abs(number)

  //Method for modulus
  def Modulus(number1: Int, number2: Int):Int = number1 % number2

  // Method for find maximum number
  def Maximum(number1: Int, number2: Int):Int = {
    if(number1 > number2) number1 else number2
  }

  //Method for find Minimum number
  def Minimum(number1: Int, number2: Int):Int = {
    if(number1 < number2) number1 else number2
  }

}
