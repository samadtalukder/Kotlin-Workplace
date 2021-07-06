package oop
// primary constructor
class Product(val productName: String, val productId: Int, val productPrice: Double) {

    fun vat(productPrice: Double, productVat: Double): Double {
        return productPrice * productVat / 100
    }
}