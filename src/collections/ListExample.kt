package collections

fun main() {
    val playerName = listOf("Pele", "Maradona", "Ronaldo", "Messi", "Neymar")
    val varieties = listOf(1, "2", 3)
    val nums = listOf(13, 2, 26, 20, 55, 51)

    val celebrity = listOf("Leonardo DiCaprio", "Amir Khan", "Tom Cruse", "Angelina Jolie", "Kate Winslet")



    println("Print Player Name: $playerName")
    println("Print Player Name Index Position: ${playerName[2]}")
    println("Print Player Name Size: ${playerName.size}")
    println("Print Player Name First Position: ${playerName.first()}")
    println("Print Player Name Last Position: ${playerName.last()}")
    println("Print Varieties List: $varieties")
    println("Print Number List: $nums")
    println("Print Number List Maximum: ${nums.max()}")
    println("Print Number List Minimum: ${nums.min()}")
    println("Print Number List Average: ${nums.average().toInt()}")
    println("Print Number List Sum: ${nums.sum()}")
    println("Print Number List Count: ${nums.count()}")
    println("Print Number Get Index: ${nums.get(3)}")
    println("Print Number Find IndexOf: ${nums.indexOf(2)}")
    println("Print Number Find IndexOf: ${playerName.indexOf("Pele")}")
    println("Print Number Find Last IndexOf: ${playerName.lastIndexOf("Neymar")}")
    println("Print Number Find Last Index: ${nums.lastIndex}")
    println("Print Number Find Last Index: ${playerName.first { s -> s.startsWith("Pele") }}")

    println("Celebrity Sorted List: ${celebrity.sorted()}")
    println("Celebrity Descending Sorted List: ${celebrity.sortedDescending()}")

    celebrity.forEach { e -> println("Print Celebrity List: $e") }

    for (cel in celebrity) {
        println("Celebrity: $cel")
    }

    for (i in 0 until celebrity.size) {
        println("Celebrity Until: ${celebrity[i]}")
    }

    for (i in celebrity.indices) {
        println("Celebrity Indices: ${celebrity[i]}")
        // println("Celebrity Index: $i")
    }
}