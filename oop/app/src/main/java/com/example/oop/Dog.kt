package com.example.oop

class Dog {
    var owner = Human()
    var name : String? = null

    fun sayHi(){
        println("Hi my name is $name, and my owner is ${owner.name}")
    }
}