package com.example.oop;

public class MotorEletrico : Motor() {


    private var nivelBateria: Int = 1



    fun temEnergia(): Boolean {
        return  nivelBateria > 0
    }

    fun gastandoEnergia(){
        println("gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }
}
