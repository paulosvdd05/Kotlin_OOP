package com.example.oop;

public class MotorEletrico {

    private var ligado: Boolean = false
    private var nivelBateria: Int = 1

    fun ligar(){
        println("Ligando motor...")
        ligado = true
    }
    fun desligar(){
        println("Desligando o motor...")
        ligado = false
    }
    fun estaLigado() : Boolean {
        return  ligado
    }

    fun temEnergia(): Boolean {
        return  nivelBateria > 0
    }

    fun gastandoEnergia(){
        println("gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }
}
