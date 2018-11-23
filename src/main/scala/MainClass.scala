
import scala.arithmeticscala.CommonArithmetics
import scala.arithmeticscala.MathImport
object MainObject /* extends App  */{
  var commonArithmetics = new CommonArithmetics
  var mathImport = new MathImport
  def main(args: Array[String]) {
    commonArithmetics.addTwoNumbers(10, 3)
    commonArithmetics.subtractNumbers(10, 3)
    commonArithmetics.divideNumbers(10, 3)
    commonArithmetics.multiplyNumbers(10, 3)
    commonArithmetics.modulusNumbers(10, 3)
    mathImport.getAbsoluteValue(-78)
    mathImport.getCubeRoot(64)
    mathImport.getCeilings(3.7267)
    mathImport.roundAVAlue(3.7267)
    mathImport.floorValue(3.7267)
    mathImport.exponentialFunction(6)
    mathImport.powerToFunction(3, 7)
    mathImport.getSquareRoot(64)
    mathImport.getHyPortunuse(6, 8)
    mathImport.logPowerTen(1000)
    mathImport.getNaturalLogBaseE(1.6238)
    mathImport.getMinimumvalue(345, 56)
    mathImport.getMaxmumvalue(345, 56)
    mathImport.getRandomNumberBetween(1, 10)
    mathImport.getRadians(90)
    mathImport.getDegrees(1.5707963)
  }

}