package com.example.oop

class MotorCombustao {

    private var ligado: Boolean = false
    private var nivelCombustivel: Int = 2
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

    fun temCombustivel(): Boolean {
        return  nivelCombustivel > 0
    }

    fun gastandoCombustivel(){
        println("gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}