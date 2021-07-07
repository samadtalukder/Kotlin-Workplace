package oop.visibilty_modifier

open class Account {
    // by default public
    open var bankLocation: String = "Dhaka"

    // private visible to this class only
    private val bankAccountNo: Int = 0

    // protected visible to this class and child class
    protected val balance: Double = 0.0

    // internal visible inside the same module
    internal var accountType: String = "Debit"

    //
    protected open fun printInfo(){
        println("Account NO: $bankAccountNo")
    }
}