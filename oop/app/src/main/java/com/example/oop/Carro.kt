package com.example.oop

class Carro constructor(
    private val motor: Motor
) {

    var cor: String? = null


    fun ligar(){
        println("Ligando carro...")
        motor.ligar()
    }
    fun desligar(){
        println("Desligando carro...")
        motor.desligar()
    }
    fun anda(){
        when{
            !motor.estaLigado() -> println("Liga o carro primeiro, neh!")
            !motor.temAutonomia() -> {
                when(motor){
                    is MotorEletrico -> println("Tem que carregar neh!?")
                    is MotorCombustao -> println("Bota combustivel neh!?")
                }
                desligar()

            }

            else -> {

                motor.gastando()
                when(motor){
                    is MotorEletrico -> println("Carro andando")
                    is MotorCombustao -> println("Carro andando: Vruum Vruuuumm!")
                }
            }
        }


    }

    fun freia(){
        println("Freiando o Carro")
    }

    fun buzina(){
        println("^@*^HU@^@&^&(*J")
    }
}