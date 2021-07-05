package collections

fun main() {
    val even = intArrayOf(2, 4, 6, 8, 10, 12, 14)
    val odd = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15)

    val containArr = arrayOf(even, odd)

    for (i in containArr){
        for (j in i){
            println("Print Array: $j")
        }
        println("")
    }

}