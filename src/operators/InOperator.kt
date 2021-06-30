package operators

fun main() {
    /* in, .., rangeTo(), downTo(), step() */
    println(" .. Operator ")
    for (num in 1..5) {
        println("$num")
    }
    println("in Operator ")
    val num = 3
    if (num in 1..6){
        println("$num")
    }

    println("rangeTo Operator")
    for (range in 1.rangeTo(10)) {
        println("$range")
    }

    println("-------------------------")
    for (str in "Kotlin Bangladesh") {
        println("$str")
    }

    println("downTo Operator")
    for (down in 6 downTo 1) {
        println("$down")
    }
    println("downTo Step")
    for (down in 6 downTo 1 step 3) {
        println("$down")
    }

    println("Until")
    for (num1 in 1 until 11) {
        println("$num1")
    }

    println("Step")
    for (num2 in 2..6 step 7) {
        println("$num2")
    }

    println("First Value Of The Range: ${(6..12 step 3).first}")
    println("Last Value Of The Range: ${(6..12 step 6).last}")
    println("Step Value Of The Range: ${(6..12 step 7).step}")

    println("Reversed Function")
    val rev = 1 downTo -9

    for (i in rev.reversed()) {
        println("$i")
    }

    println("Predefined Function")
    val pre = 20..40

    println("MAX: ${pre.max()}")
    println("MIN: ${pre.min()}")
    println("AVERAGE: ${pre.average()}")
    println("COUNT: ${pre.count()}")

}