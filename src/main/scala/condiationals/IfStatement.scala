package scala.conditionals
class IfStatement {
    // var age = 27;

    def checkAge(age: Int): Unit = {
if (age < 18) {
        println("Can't vote, minor!")
    } else if ((18 <= age) && (age <= 21)) {
        println("Can vote but cant drive")
    } else {
        println("can vote and drive")
    }
    }

    
}