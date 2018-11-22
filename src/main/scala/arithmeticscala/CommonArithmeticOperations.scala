package scala.arithmeticscala

class CommonArithmetics {
    def addTwoNumbers(x: Int, y: Int): Unit = {
       println("The sum of " + x +" and " + y +" is " +  (x + y))
    }

    def subtractNumbers(x: Int, y: Int): Unit = {
        println("The difference between " + x +" and " + y +" is " +  (x - y))
    }

    def divideNumbers(x: Int, y: Int): Unit = {
        println("The quotient between " + x +" and " + y +" is " +  ((x.toDouble) / (y.toDouble)))
    }

    def multiplyNumbers(x: Int, y: Int): Unit = {
        println("The product between " + x +" and " + y +" is " +  (x * y))
    }

    def modulusNumbers(x: Int, y: Int): Unit = {
        println("The remaider when you divide " + x +" and " + y +" is " +  (x % y))
    }

    // def bigIntegerNumber(x:BigInt): Unit = {
    //     x = "64747467837387383758584993847588574895848989"
    //     println("Doubling the big interger " + (BigInt(x))  + " gives " + (BigInt(x)) )
    // }
}