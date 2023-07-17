package com.example.oop

class Dog constructor(
    private val ownerName: String
) {
    var name : String? = null

    fun sayHi(){
        println("Hi $ownerName, my name is $name")
    }
}