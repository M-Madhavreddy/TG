package Assignment_1

import Demo.Assignment_1.Calculator
import org.scalatest.funsuite.AnyFunSuite

// using Funsuite testing style which is more convinent during structring and heirarchy
class CalculatorTest extends  AnyFunSuite{
      var calculator = new Calculator

  test("addtion of two numbers"){
    assert(calculator.addition(10,20)==30)
  }

  test("Sustraction of two numbers") {
    assert(calculator.subtract(10, 20) == -10)
    assert(calculator.subtract(5,3)==2)
  }

  test("multiplication of two numbers") {
    assert(calculator.multiplication(10, 20) == 200)
    assert(calculator.multiplication(10, 0) == 0)
  }

  test("divison of two numbers") {
    assert(calculator.division(20, 10) == 2)
    assert(calculator.division(10, 20) == 0)
    assertThrows[ArithmeticException](calculator.division(10, 0))
  }
}


// using Flatspec testing style which is more convinent in readabilty
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorTest1 extends AnyFlatSpec {
  val calculator = new Calculator

  "addition" should "return the sum of two numbers" in {
    assert(calculator.addition(10, 20) == 30)
  }

  "subtraction" should "return the difference of two numbers" in {
    assert(calculator.subtract(10, 20) == -10)
    assert(calculator.subtract(5, 3) == 2)
  }

  "multiplication" should "return the product of two numbers" in {
    assert(calculator.multiplication(10, 20) == 200)
    assert(calculator.multiplication(10, 0) == 0)
  }

  "division" should "return the quotient of two numbers" in {
    assert(calculator.division(20, 10) == 2)
    assert(calculator.division(10, 20) == 0)
  }

  it should "throw ArithmeticException when dividing by zero" in {
    assertThrows[ArithmeticException](calculator.division(10, 0))
  }
}


