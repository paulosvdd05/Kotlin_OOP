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
            !motor.temCombustivel() -> println("Coloca combustivel antes, neh!")
            else -> {
                println("Carro andando: Vruum Vruuuumm!")
                motor.gastandoCombustivel()
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