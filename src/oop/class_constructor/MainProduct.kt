package oop.class_constructor

fun main() {
    val product = Product(productName = "Addidas Shoe", productId = 124, productPrice = 300.00)
    val productArr = arrayOf(
        Product(productName = "Nike Shoe", productId = 125, productPrice = 6000.00),
        Product(productName = "Puma Shoe", productId = 126, productPrice = 400.00),
        Product(productName = "Bata Shoe", productId = 127, productPrice = 400.00)
    )

    val productVat = product.vat(productPrice = product.productPrice, productVat = 15.00)
    val primaryConstructorWithInit = PrimaryConstructorWithInit(name = "Talukder", age = 26)
    primaryConstructorWithInit.fullName = "Khan"

    val torchlight = Torchlight()
    torchlight.turnOff()



    val secondaryConstructor= Secondary("Babu",155)

    println("Product ID: ${product.productId}")
    println("Product Name: ${product.productName}")
    println("Product Price: ${product.productPrice}")
    println("Product Vat: $productVat")
    println("Product Vat: ${productArr[0].productName}")

    productArr.forEach { println(it.productName) }

    torchlight.getTorchLightStatus()




}