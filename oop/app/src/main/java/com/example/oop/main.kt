package com.example.oop


fun main(){
    val dog = Dog()
    dog.name = "Linux"
    dog.sayHi(ownerName = "Paulo Dias")

    val dogLeticia = Dog()
    dogLeticia.name = "Android"
    dogLeticia.sayHi(ownerName = "Leticia" )
}