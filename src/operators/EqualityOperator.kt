package operators

fun main() {
    /* ==, >, <, >=, <=, != */

    val num1 = 36
    val num2 = 24
    val str1 = "hello"
    val str2 = "olleh"

    val isEqual = num1 == num2
    val isStringEqual = str1 == str2

    val isNotEqual = num1 != num2
    val isStringNotEqual = str1 != str2

    val isGreaterThen = num1 > num2
    val isGreaterThenOrEqual = num1 >= num2

    val isLessThen = num1 < num2
    val isLessThenOrEqual = num1 <= num2

    val isStringGreaterThen = str1 != str2

    val a = 12
    val b = 12-10

    val maximum = if (a > b) {
        println("A is maximum")
        a
    } else {
        println("B is maximum")
        b
    }

    println("Check Equal: $isEqual")
    println("Check String Equal: $isStringEqual")
    println("Check String Not Equal: $isStringNotEqual")
    println("Check Not Equal: $isNotEqual")
    println("Num1 Is Greater Than Num2: $isGreaterThen")
    println("Num1 Is Greater Than Or Equal Num2: $isGreaterThenOrEqual")
    println("Num1 Is Less Than Num2: $isLessThen")
    println("Num1 Is Less Than Or Equal Num2: $isLessThenOrEqual")
    println("Check Not Equal: $isStringGreaterThen")
    println("Maximum: $maximum")
}