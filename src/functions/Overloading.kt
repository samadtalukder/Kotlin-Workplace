package functions

fun main() {
    val overload1 = overload("Infinity")
    val overload2 = overload(109)
    val overload3 = overload("Dhaka","Bangladesh")

    println("Print: $overload1")
    println("Print: $overload2")
    println("Print: $overload3")
}

fun overload(value: String): String {
    return value
}

fun overload(value1: String, value2: String): String {
    return "$value1 $value2"
}

fun overload(value: Int): Int {
    return value
}