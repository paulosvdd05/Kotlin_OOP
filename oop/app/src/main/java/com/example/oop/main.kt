package com.example.oop


fun main(){
    val motorCombustao = MotorCombustao()
    val motorEletrico = MotorEletrico()

    val fuca = Carro(motorCombustao)
    fuca.ligar()
    fuca.anda()
    fuca.anda()
    fuca.anda()

    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.anda()
    tesla.anda()


}