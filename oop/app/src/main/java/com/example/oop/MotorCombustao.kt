package com.example.oop

class MotorCombustao : Motor() {


    private var nivelCombustivel: Int = 2


    fun temCombustivel(): Boolean {
        return  nivelCombustivel > 0
    }

    fun gastandoCombustivel(){
        println("gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}