package operators

fun main() {
    /* &&, ||, ! */

    val open = 9
    val close = 12
    val hour = 1

    val status = if (hour >= open && hour <= close) {
        println("Working Time")
        true
    } else {
        println("Closing")
        false
    }

    val orStatus = if (hour > open || hour < close) true else false

    val notStatus = if (!(hour > open || hour < close)) true else false

    println("AND Status: $status")
    println("OR Status: $orStatus")
    println("NOT Status: $notStatus")

}