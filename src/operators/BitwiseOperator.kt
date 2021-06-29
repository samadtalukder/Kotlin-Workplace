package operators

fun main() {
    /*================================*/
    /*

    6 =         0110   In Binary
    5 =         0101   In Binary  {AND}
    -----------------------
    Calculate   0100 (4) In Decimal

    6 =         0110    {OR}
    5 =         0101
    -----------------------
    Calculate   0111 (7) In Decimal

    6 =         0110    {XOR}
    5 =         0101
    -----------------------
    Calculate   0011 (3) In Decimal

    */
    /*================================*/
    val x = 6
    val y = 5
    val num = 202

    val and = x.and(y)
    val or = x.or(y)
    val xor = x.xor(y)


    println("AND: $and")
    println("OR: $or")
    println("XOR: $xor")
    println("Left Shift: ${num shl 1}")
    println("Right Shift: ${num shr 0}")
}