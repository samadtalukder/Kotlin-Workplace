package oop.inheritance

class OnePlus(mobileBrand: String, mobileName: String, mobileModel: Int, mobilePrice: Double) :
    Mobile(mobileBrand, mobileName) {
        init {
            println("Mobile Model: $mobileModel")
            println("Mobile Price: $mobilePrice")
        }
}