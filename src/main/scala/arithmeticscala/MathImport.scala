package scala.arithmeticscala

//import all methods from math class
import scala.math._

class MathImport {
    def getAbsoluteValue(x: Int): Unit = {
        println(abs(x))
    }

    def getCubeRoot(x: Int): Unit = {
        println(cbrt(x))
    }

    def getCeilings(x: Double): Unit = {
        println(ceil(x))
    }

    def roundAVAlue(x: Double): Unit = {
        println(round(x))
    }

    def floorValue(x: Double): Unit = {
        println(floor(x))
    }

    def exponentialFunction(x: Int): Unit = {
        println(exp(x))
    }

    def powerToFunction(x: Int, y: Int): Unit = {
        println(pow(x, y))
    }

    def getSquareRoot(x: Int): Unit = {
        println(sqrt(x))
    }

    def getHyPortunuse(x: Int, y: Int): Unit = {
        println(hypot(x, y))
    }

    def logPowerTen(x: Int): Unit = {
        println(log10(x))
    }

    def getNaturalLogBaseE(x: Double): Unit = {
        println(log(x))
    }

    def getMinimumvalue(x: Int, y: Int): Unit = {
        println(min(x,y))
    }

    def getMaxmumvalue(x: Int, y: Int): Unit = {
        println(max(x,y))
    }

    def getRandomNumberBetween(x: Int, y: Int): Unit = {
        println((random * (y - x) + 1).toInt)
    }

    def getRadians(x: Int): Unit = {
        println(toRadians(x))
    }

    def getDegrees(x: Double): Unit = {
        println(toDegrees(x))
    }

}