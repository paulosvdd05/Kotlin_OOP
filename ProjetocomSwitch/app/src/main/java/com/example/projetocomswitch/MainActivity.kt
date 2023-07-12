package com.example.projetocomswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup.OnCheckedChangeListener
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var  interruptor: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.statusSwitch)
        botao = findViewById(R.id.button)
        interruptor = findViewById(R.id.switch1)

        interruptor.setOnCheckedChangeListener(object : OnCheckedChangeListener{

        })

    }
}