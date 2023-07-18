package com.example.oop

class Carro constructor(
    private val motorCombustao: MotorCombustao
) {

    var cor: String? = null


    fun ligar(){
        println("Ligando carro...")
        motorCombustao.ligar()
    }
    fun desligar(){
        println("Desligando carro...")
        motorCombustao.desligar()
    }
    fun anda(){
        when{
            !motorCombustao.estaLigado() -> println("Liga o carro primeiro, neh!")
            !motorCombustao.temCombustivel() -> {
                println("Coloca combustivel antes, neh!")
                motorCombustao.desligar()

            }

            else -> {
                println("Carro andando: Vruum Vruuuumm!")
                motorCombustao.gastandoCombustivel()
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