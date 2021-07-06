package oop

class Torchlight {
     var isON: Boolean = false

    fun turnOn() {
        isON = true
    }

    fun turnOff() {
        isON = false

    }

    fun getTorchLightStatus() {
        if (!isON) {
            println("Torch Light off")
        } else {
            println("Torch Light On")
        }
    }


}