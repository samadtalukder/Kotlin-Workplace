package data_type


fun main() {
    /* val is a immutable variable ,it's can be assigned only once. It's like Final variable */
    val test = "Hello"

    /* var is mutable variable , it's can be assigned multiple times. */
    var test2 = "Hello $test"

    var test3: String = "Nigga"
    test3="NIbbi"
    test3="Nigga Nibbi"

    var num :Int
    num=20

    print(test)
    print("\n")
    print(test2 + "\n")
    println(test3)
    println(num)
}

