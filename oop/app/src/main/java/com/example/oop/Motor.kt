package com.example.oop

class Motor {

    private var ligado: Boolean = false
    private var nivelCombustivel: Int = 2
    fun ligar(){
        ligado = true
    }
    fun desligar(){
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