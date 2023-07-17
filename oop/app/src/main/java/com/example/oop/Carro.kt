package com.example.oop

class Carro constructor(
    private val motor: Motor
) {

    var cor: String? = null


    fun ligar(){
        motor.ligar()
    }
    fun desligar(){
        motor.desligar()
    }
    fun anda(){
        if(motor.estaLigado()){
        println("Carro andando: Vruum Vruuuumm!")
        }else {
            println("Liga o carro primeiro, neh!")
        }
    }

    fun freia(){
        println("Freiando o Carro")
    }

    fun buzina(){
        println("^@*^HU@^@&^&(*J")
    }
}