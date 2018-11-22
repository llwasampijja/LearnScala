
import scala.arithmeticscala.CommonArithmetics
object MainObject /* extends App  */{
  var commonArithmetics = new CommonArithmetics
  def main(args: Array[String]) {
    commonArithmetics.addTwoNumbers(10, 3)
    commonArithmetics.subtractNumbers(10, 3)
    commonArithmetics.divideNumbers(10, 3)
    commonArithmetics.multiplyNumbers(10, 3)
    commonArithmetics.modulusNumbers(10, 3)
  }

}