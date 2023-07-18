package com.example.oop


fun main(){
    val motorCombustao = MotorCombustao()
    val fuca = Carro(motorCombustao)


    val tesla = Carro(motorCombustao)
    tesla.ligar()
    tesla.anda()

}