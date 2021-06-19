package variables

fun main() {

    /* Non-Nullable Types */
    var str = "Kotlin" // Non-nullable types are normal string
    // str=null // while we assign null value to non-nullable string show compile error
    println("Non-Nullable: $str")

    /* Nullable Types*/
    var checkNull: String? = null // variable declared as nullable
    checkNull = "Programming"
    println("Nullable: $checkNull")

    var nullable: Int?
    nullable = null
    println("Nullable: $nullable")

    /* Safe Call Operator (?.) */
    val country: String? = null
    val countryLength = country?.length

    println("Country Name: $country")
    println("Country Length: $countryLength")

    val listWithNull: List<String?> = listOf("Kotlin", null, "Programming")
    for (item in listWithNull) {
        item?.let {
            println("List Item: $item") // print list item without null
        }
    }

    /* Checking Null In Conditions */
    var team: String? = "Brazil"
    var teamLength = if (team != null) team.length else -1

    println("Team: $team")
    println("Team Length: $teamLength")

    team = null
    println("Team: $team")

    teamLength = team?.length ?: -1
    println("Team Length: $teamLength")

    /* if (team != null) {
         println("Team: ${team.toUpperCase()}")
     } else {
         println("No Team Found")
     }*/

    /* Elvis Operator (?:). It's a null safety checking */
    val dev: String? = "Android"
    val devLength = if (dev != null) dev.length else -1
    val usingElvis = dev?.length ?: -1
    val elvis = dev ?: ""

    println("Dev: $dev")
    println("Dev Length: $devLength")
    println("Using Elvis Dev Length: $usingElvis")
    println("Using Elvis: $elvis")

    /* Combining Safe Call & Elvis Operator */
    val season = "Summer"
    val seasonLength = dev?.length ?: -1

    println("Season: $season")
    println("Season Length: $seasonLength")

    /* Not Null Assertion Operator (!!) */
    val tournament: String? = null
    //val result = tournament!!.length
    val resultSafe = tournament?.length

    println("Tournament: $tournament")
    //println("Result: $result") // Throw KotlinNullPointerException using not-null assertion
    println("Result Safe: $resultSafe")

    /* Filtering Nullable Types */
    var ide: List<Int?> = listOf(1, 11, null, 33)
    var ideResult=ide.filterNotNull()
    println("Filter Nullable: $ide")
    println("Filter Nullable: $ideResult")

    /* Safe Casts */
}