package operators

fun main() {
    /* Basic Assignment */

    var x: Int
    val y = 10

    x = 11
    x += y
    // x = y

    println("X: $x")
    println("Y: $y")

    /* Arithmetic Operator (+, -, *, /, %)*/
    val x1 = 10
    val y1 = 12
    val z1 = 15

    val result = x1 + y1 * 10 + z1 - 5 / 4
    println("Result: $result")

    val a = 10
    val b = 20.25

    val add = a + b
    val sub = add + -20
    val mul = sub + 6
    val div = mul + 9
    val mod = div % 5

    println("Addition: $add")
    println("Subtraction: $sub")
    println("Multiplication: ${mul.toInt()}")
    println("Divider: $div")
    println("Modulus: $mod")

    /* Increment & Decrement */
    var inc = 11
    inc = inc + 1
    println("Increment: $inc")

    var dec = 5
    dec = dec - 1
    println("Decrement: $dec")

    var preIncX = 3
    var preIncY = ++preIncX
    val postInc = preIncY++

    println("Pre-Increment: $preIncY")
    println("Post-Increment: $postInc")

    var preDecX = 3
    var preDecY = --preDecX
    val postDec = preDecY--

    println("Pre-Decrement: $preDecY")
    println("Post-Decrement: $postDec")

    /* Unary Operator */
    var number = 50
    val minus = -(number)
    val plus = +(number)

    println("Unary Minus: $minus")
    println("Unary Plus: $plus")
}