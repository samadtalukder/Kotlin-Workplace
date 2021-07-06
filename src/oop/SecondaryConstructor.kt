package oop

open class SecondaryConstructor {
    private var _name: String = ""
    private var _mobileNo: Int = 0

    constructor(name: String,mobileNo: Int) {
        _name = name
        _mobileNo = mobileNo
        println("Name: $_name -> Mobile No: $_mobileNo")
    }

    constructor(mobileNo: Int) {
        _mobileNo = mobileNo
        println("Mobile No: $_mobileNo")
    }
}


