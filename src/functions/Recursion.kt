package functions

fun main() {
    val factorial= calculateFactorial(4)

    println("Factorial: $factorial")
}

fun calculateFactorial(num: Int): Long {
    return if (num == 1) num.toLong() else num * calculateFactorial(num - 1)
}