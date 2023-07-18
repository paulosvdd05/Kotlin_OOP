package com.example.oop

open class Motor {
    private var ligado: Boolean = false

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

    fun temAutonomia(): Boolean {
        return true
    }

    fun gastando(){

    }


}