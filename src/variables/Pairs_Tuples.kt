package variables

fun main() {
    val gender = Triple("Male", "Female", "Other")
    val selectGender = Pair("Gender", gender)

    val (name, age) = Pair("Rony", 10)
    val (country, code, digit) = Triple("88", "00", "99")


    println("Gender Classification: $selectGender")
    println("First Ordering: ${gender.first}")
    println("Second Ordering: ${gender.second}")
    println("Third Ordering: ${gender.third}")
    println("Convert to list: ${gender.toList()}")
    println("Copy Value: ${gender.copy("Misc")}")
    println("Convert to list: ${selectGender.toList()}")
    println("Name: $name, Age: $age")
}