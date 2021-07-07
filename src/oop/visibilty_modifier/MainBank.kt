package oop.visibilty_modifier

fun main() {
    val bb = BangladeshBank()
    bb.accountType = "Debit"

    // can't call this method because its protected method
    // bb.printInfo()

    bb.printInfo("Dhanmondi")


}