package collections

fun main() {
    val bdSingerName = setOf(1 to "James", 2 to "Ayub Bacchu", 3 to "Hasan", 4 to "Mizan", 5 to "Shafin")
    val score = setOf(50, 57, 7, 10, 23, 50, 100)
    val dropScore=score.drop(3)

    println("Print Singer Name: $bdSingerName")
    println("Print Singer Total Size: ${bdSingerName.size}")
    println("Print Score: $score")
    println("Print Score Total Size: ${score.size}")
    println("Print Score Contains: ${score.contains(7)}")
    println("Print Score Contains: ${score.containsAll(setOf(50, 11))}")
    println("Check Empty: ${score.isEmpty()}")
    println("Check Empty: ${score.isNotEmpty()}")
    println("ElementAt: ${score.elementAt(0)}")

    for (i in dropScore){
        println("$i")
    }
}