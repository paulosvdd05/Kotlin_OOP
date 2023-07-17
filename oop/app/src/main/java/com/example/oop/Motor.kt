package com.example.oop

class Motor {

    private var ligado: Boolean = false
    fun ligar(){
        ligado = true
    }
    fun desligar(){
        ligado = false
    }
    fun status() : String {
        return  if(ligado) "Ligado" else "Desligado"
    }
}