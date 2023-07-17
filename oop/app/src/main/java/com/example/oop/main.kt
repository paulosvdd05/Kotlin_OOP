package com.example.oop


fun main(){
    val motor = Motor()
    motor.ligar()
    println("Motor esta ${motor.status()}")
    motor.desligar()
    println("Motor esta ${motor.status()}")

}