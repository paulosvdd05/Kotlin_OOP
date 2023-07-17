package com.example.oop


fun main(){
    val motor = Motor()
    motor.ligado = true
    println(motor.ligado)
    motor.ligado = false
    println(motor.ligado)

    val carro = Carro()
    carro.anda()
}