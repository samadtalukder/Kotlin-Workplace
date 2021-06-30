package loop

fun main() {
    val listItem = listOf("Bangladesh", "India", "England", "Australia")
    var index = 0
    var value = 3

    while (value < 10) {
        println(value)
        value *= 3
    }

    println("")

    while (index < listItem.size) {
        println("Index: $index Item: ${listItem[index]}")
        index++
    }
    println("")
    val arr = IntArray(5)
    for (i in arr) {
        print(arr[i])
    }
}