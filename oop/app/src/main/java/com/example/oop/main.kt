package com.example.oop


fun main(){
    val motor = Motor()
    motor.ligar()
    println(motor.ligado)
    motor.desligar()
    println(motor.ligado)

    val carro = Carro()
    carro.anda()
}