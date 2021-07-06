package oop.inheritance

class iPhone(mobileBrand: String, mobileName: String, mobileModel: Int, mobilePrice: Double) :
    Mobile(mobileBrand, mobileName) {
        init {
            println("Mobile Model: $mobileModel")
            println("Mobile Price: $mobilePrice")
        }
}