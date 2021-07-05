package collections

fun main() {
    val goal = mapOf("Pele" to 77, "Neymar" to 67, "Messi" to 76, "Ronaldo" to 108)
    val product = hashMapOf("Chips" to 70, 60 to "Chocolate", "Soap" to 30)
    val hashItem = HashMap<String, Int>()

    hashItem["Shakib"] = 75
    hashItem["Tamim"] = 28
    hashItem["Mushfiq"] = 15
    hashItem["Mashrafee"] = 2

    println("Product: $product")

    for ((key, value) in hashItem) {
        println("Key: $key, Value: $value")
    }

    for (i in goal.keys) {
        print("Keys: $i, ")
    }

    for (v in goal.values) {
        println("Values: $v")
    }

    for (k in goal.keys) {
        println("$k= ${goal[k]}")
    }

    println("Print All Goal: $goal")
    println("Print All Entries: ${goal.entries}")
    println("Print All Keys: ${goal.keys}")
    println("Print All Values: ${goal.values}")
    println("Print Goal Map Size: ${goal.size}")
    println("Print Goal Map Size: ${goal.count()}")
    println("Print Even Goal: ${goal.count { it.value % 2 == 0 }}")
    println("Print Greater then 76: ${goal.count { it.value >= 76 }}")


}