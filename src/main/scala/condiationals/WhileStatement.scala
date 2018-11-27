package scala.conditionals
/**
This includes the if statment as well as the while loop
*/

import scala.math._

class WhileStatement {
    def printPrimeNumbers(x: Int, y: Int): Unit = {
        var n = x
        var primeNumbers = List[Int]()
        while(n < y){
            if (isPrimeNumber(n)){
                primeNumbers = n::primeNumbers
            }

            n = n + 1

        }

        println(primeNumbers.reverse)
    }

    def isPrimeNumber(n: Int): Boolean = {
        if ((!((2 until n) exists(n % _ == 0)))&&(n >= 2)){
            return true
        } else {
            return false
        }
    }
}