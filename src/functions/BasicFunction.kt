package functions

import sun.security.util.Length

fun main() {
    sumTwoNumber(11.10, 33.30)
    val result = returnMultiplyTwoNumber(59.10, 66.69)
    val printFullName = showName("Samad", "Talukder", 26)
    val printSingleExpression = singleExpression(22, 9.33)
    val default = defaultFunctionParameter("Java", 1995)
    val printDivided = divided(10.10, 2.12)
    val printStr = str("J", "K")
    val printSub = showSub(10, 2)

    namedArgument("Hello Kotlin Bangladesh", 10)

    println("Result: $result")
    println("Name: $printFullName")
    println("Result: $printSingleExpression")
    println("Result: $default")
    println("printDivided: $printDivided")
    println("printStr: $printStr")
    println("printSub: $printSub")

}

fun sumTwoNumber(x: Double, y: Double) {
    val result = x + y
    println("Result: $result")
}

fun returnMultiplyTwoNumber(x: Double, y: Double): Int {
    val result = x * y
    return result.toInt()
}

fun singleExpression(i: Int, j: Double): Double {
    return i - j
}

fun showName(firstName: String, lastName: String, age: Int): String = "$firstName $lastName \nAge: $age"

fun showSub(i: Int, j: Int): Int = i - j

fun divided(x: Double, y: Double) = x / y

fun str(x: String, y: String) = "$x - $y"

fun defaultFunctionParameter(name: String = "Kotlin", release: Int = 2017): String {
    return "Name: $name- Release Year: $release";
}

fun namedArgument(text: String, length: Int) {
    for (num in 1..length) {
        println("Output: $text")
    }
}