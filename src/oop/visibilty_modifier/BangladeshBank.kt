package oop.visibilty_modifier

class BangladeshBank : Account() {
    override var bankLocation = "Dhanmondi"

    override fun printInfo() {
        super.printInfo()
    }

    fun printInfo(bankLocation:String){
        println("Bank Location: $bankLocation")
    }
}