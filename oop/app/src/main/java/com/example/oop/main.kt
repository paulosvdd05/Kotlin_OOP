package com.example.oop


fun main(){
    val paulo = Human()
    paulo.name = "Paulo Dias"
    val dog = Dog()
    dog.owner = paulo
    dog.name = "Linux"
    dog.sayHi()

    val lucas = Human()
    lucas.name = "Lucas"
    dog.owner = lucas
    dog.sayHi()
}