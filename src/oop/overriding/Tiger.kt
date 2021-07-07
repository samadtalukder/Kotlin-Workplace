package oop.overriding

class Tiger : Animal() {

    override var animalSound: String = "chuff"


    override fun animalName(animalName: String) {
        super.animalName(animalName)
        println("Animal Name: $animalName")
    }

    fun animalSound() {
        println(super.animalSound)
    }
}