package variables

fun main() {
    /* Smart Casts - use is & !is Operators */
    val firstName = "Samad"

    if (firstName is String) {
        println("First Name: $firstName")
    } else {
        println("Type Error")
    }

    val id = 1724
    if (id !is Int) {
        println("ID: $id")
    } else {
        println("Type Error")
    }

    /* Type Checking */
    val listType: List<Any> = listOf("Software", 223, true, 3.14, 33.332242f, false)

    for (listValue in listType) {
        when (listValue) {
            is String -> println("String Type: $listValue")
            is Int -> println("Int Type: $listValue")
            is Boolean -> println("Boolean Type: $listValue")
            is Double -> println("Double Type: $listValue")
            is Float -> println("Float Type: $listValue")
            else -> println("Unknown Type")
        }
    }


/* Explicit Type Casts - use unsafe(as) & safe(as?) operator */
    val obj: Any = "Kotlin Programming"
    val intObj: Int = 233

    val str = obj as String

    val str2 = intObj as? String // cannot be cast

    println("Print: $str")
    println("Print: $str2")


}