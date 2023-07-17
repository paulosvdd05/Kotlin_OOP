package com.example.oop


fun main(){
    val motor = Motor()
    val carro = Carro(motor)
    carro.anda()
}