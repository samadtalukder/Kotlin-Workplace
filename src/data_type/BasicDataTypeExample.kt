package data_type

fun main() {
/*
* Kotlin built in Data Types are:
*
* Number
* Character
* Boolean
* Array
* String
*
* */
    /* Example Of Character Data Type */
    val char1: Char
    char1 = 'C'
    println(char1)

    /* Example Of Boolean Data Type */
    val isSuccess: Boolean
    isSuccess = false
    println(isSuccess)

    /* Example Of Integer Data Type */
    val num: Int
    num = 2020
    println(num)

    /* Example Of String Data Type */
    val str: String
    str = "Caught Lean"
    println(str)

    /* Example Of Array Data Type */
    val arr = arrayOf(1, 2, 3, "He")
    for (arrElement in arr) {
        print(arrElement)
    }
    println()

    val arrSize = arr.size
    val arrFirstID = arr[0]
    val arrLastID = arr[arr.size - 1]

    println("Array Size: $arrSize")
    println("Array First Element: $arrFirstID")
    println("Array Last Element: $arrLastID")


}