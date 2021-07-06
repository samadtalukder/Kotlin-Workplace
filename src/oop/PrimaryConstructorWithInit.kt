package oop
// primary constructor is part of the class header
// primary constructor have a limitation that it doesn't have a body . can't contain code
// secondary constructor always create with 'constructor' keyword
// secondary constructor needs to delegate to the primary constructor, either directly or indirectly
// 'init' block can be used to write initialization code for primary constructor



class PrimaryConstructorWithInit(name: String, age: Int) {
    var fullName: String
    val countAge: Int
    val nameProperty= name.also(::println)


    init {
        fullName = name


        println("Full Name: $fullName")
        println("Name Property: $nameProperty")

        println("Name Length: ${fullName.length}")
    }

    init {
        countAge = age
        println("Age: $age")
    }
}