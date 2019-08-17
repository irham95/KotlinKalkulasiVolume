package com.android.wr.belajarkotlin1

fun main() {
    var nameVar : String = "andi"
    val nameVal : String = "andi"

    val helloVal = 20
    var helloVar = 50

    hello()
    getData(nameVar, helloVal)
    getArray()
    decision(helloVar)


}


fun hello() {
    println("hello kotlin!")
}

fun getData(name : String, umur : Int) {
    print("Hello nama saya $name, umur saya $umur")
}


fun getArray() {
    val intArray = intArrayOf(1,3,4,5,7)
    println(intArray[4])
}

fun decision(umur : Int) {
    var status: String
    if (umur < 20)
        status = " umur andi muda"
    else {
        status = " umur andi tua"
    }
    print(status)
}



