package oop.getter_setter

fun main() {
    val book = Book()
    book.bookName = "Sapiens: A Brief History of Humankind"
    book.bookAuthor = "Yuval Noah Harari"
    book.bookPrice = 500.00

    println("Book Name: ${book.bookName}")
    println("Book Author: ${book.bookAuthor}")
    println("Book Price:$ ${book.bookPrice}")
}