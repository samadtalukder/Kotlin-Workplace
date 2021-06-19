package variables

// Declared Global Variable `Int` type is inferred
var glob=49
val globVal=69

fun main() {


    /* Mutable Variable */

    //  Declared with data type
    var num: Int = 10
    println("Num: $num")

    //  Compiler inferred declaration `Int` type is inferred
    var num2 = 21
    println("Num2: $num2")

    /* Immutable Variable */

    //  Declared with data type
    val imuValue: String = "Bangaldesh"
    println("Immutable Value: $imuValue")

    //  Compiler inferred declaration `Int` type is inferred
    val imuNum = 22
    println("Immutable Number: $imuNum")

    // Deferred assignment Declaration : no initial value is provided
    val value:Int
    value=30
    println("Value: $value")

    /* Global/Top-Level Variable */
    println("Global Variable: $glob")
    println("Global Val: $globVal")


}