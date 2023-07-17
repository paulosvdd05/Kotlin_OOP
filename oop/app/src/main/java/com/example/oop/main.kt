package com.example.oop


fun main(){
    val paulo = Human()
    paulo.name = "Paulo Dias"
    val dog = Dog(paulo)
    dog.name = "Linux"
    dog.sayHi()
}