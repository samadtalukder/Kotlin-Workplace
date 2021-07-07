package collections

fun main() {
    val arrNums = arrayOf(1, "sd", 20.30, 200, "Love")
    arrNums.set(4, "Kotlin")
    val arrPlus = arrNums.plus("Android")
    val arrSlice = arrNums.slice(0..2)


    // create integer array with specified size
    // all elements initialize to zero
    val intArr = IntArray(5) { i -> i }
    val sortArr = intArrayOf(10, 3, 33, 2, 52, 9)



    // 2 * 2 = 4
    // 3 * 2 = 6
    // 4 * 2 = 8
    // 5 * 2 = 10
    // 6 * 2 = 12
    // construct with size and fill with it index
    val itArr = IntArray(5) { (it + 2) * 2 }

    val noOfEvens = itArr.count { it % 2 == 0 }

    println("Sorting Array: ${sortArr.sortedArray().contentToString()}")
    println("Sorting Descending: ${sortArr.sortedArrayDescending().contentToString()}")
    println("Arrays: ${arrNums.contentToString()}")
    println("Array Plus: ${arrPlus.contentToString()}")
    println("Array Slice: $arrSlice")
    println("Array First Index: ${arrNums.first()}")
    println("Array Last Index: ${arrNums.last()}")
    println("Array Index: ${arrNums.indexOf(1)}")
    println("Arrays Get: ${arrNums.get(1)}")
    println("ArraySize: ${arrNums.size}")

    println("Array Max: ${itArr.maxOrNull()}")
    println("Array Min: ${itArr.minOrNull()}")
    println("Array Average: ${itArr.average()}")
    println("Array Sum: ${itArr.sum()}")
    println("Array Count: ${itArr.count()}")
    println("Number Of Even: $noOfEvens")

    println("Array Index : ${arrNums[2]}")
    println("Int Array: ${intArr.contentToString()}")

    itArr.forEach { println("Array: $it") }

    for (i in arrNums) {
        println("$i")
    }
}