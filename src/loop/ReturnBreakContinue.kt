package loop

fun main() {

    /*------------- Continue -----------------*/
    var num = 3
    while (num < 20) {
        num += 1
        if (num % 2 != 0) {
            continue
        }
        println("Num= $num")
    }
    println("-------------------------------------")
    /*------------- Break -----------------*/
    for (i in 1..10) {
        println("Outer Loop i: $i")
        for (j in 1..5) {
            println("Inner Loop j: $j")
            if (j == 3) break
        }
    }

    println("-------------------------------------")
    /*------------- Return -----------------*/
}