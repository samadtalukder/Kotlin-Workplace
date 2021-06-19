package variables


fun main() {
    //  Val: val is read only. Once a val is assigned, it can never be assigned.

    val playerName = "Hello" // Assigned a val variable

    // playerName="World"; // Can't reassigned this variable
    println("" + playerName) // Print this variable

    //  There are special case Val can return a different value
    val time = System.currentTimeMillis()
    println("Time: $time")

    //  Wait a millisecond
    println("Time: $time") // the value of "time" will be different both times

    var point = 4
    point += 5
    println("Point: $point")

    var num1 = 10
    val num2 = num1

    num1 = 30

    println("Print Num1: $num1")
    println("Print Num2: $num2")

    var x = 11
    var y = 99
    val temp = x
    x = y
    y = temp

    println("X: $x")
    println("Y: $y")

    var sum = 3
    sum = sum + 5
    sum+=6

    println("Sum: $sum")

}