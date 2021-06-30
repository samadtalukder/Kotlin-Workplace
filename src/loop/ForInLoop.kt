package loop

fun main() {
    /*---------------------- For Loop ----------------------*/
    for (num in 1..9) {
        println("$num")
    }
    println("-------------------------")
    for (str in "Android") {
        // println("${str.inc()}")
        println("${str.dec()}")
    }

    /*---------------------- Repeat ----------------------*/

    println("--------- Repeat ----------------")
    repeat(3) {
        println("${1 + 1}")
    }

    println("--------- Repeat Index----------------")
    repeat(3) { index ->
        println("$index")
    }

    /*---------------------- Iterating Over an Array ----------------------*/
    println("--------- Iterating Over an Array ----------------")

    val arr = arrayOf(10, 20, 30, 33, 66, 41)
    for (i in arr) {
        println("$i")
    }

    println("-----------------------")

    val charArr = arrayOf('A', 'c', 'K', 'L', 'I', 'n')
    for (i in charArr.indices) {
        println("$i")
    }
    println("-----------------------")
    for (i in charArr.indices) {
        println("${charArr[i]}")
    }

    println("-----------------------")
    val items = listOf("Java", "Kotlin", "Dart")
    val items2 = listOf(10, 20, 22, 33.50, 55.555)

    for (i in items) {
        println(i)
    }

    println("-----------------------")

    for (i in items2) {
        println(i)
    }
}