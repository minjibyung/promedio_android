package com.example.promedio_notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensage)

        val campoMensaje=findViewById<TextView>(R.id.txtMensaje)

        val miBundle: Bundle? =this.intent.extras

        if (miBundle != null) {
            campoMensaje.text = "Hola ${miBundle.getString("Nombre")} Bienvenid@\n" +
                    "La materia a validar es: ${miBundle.getString("Materia")}\n" +
                    "Las notas a validar son: Nota 1: ${miBundle.getDouble("Nota1")}\n" +
                    "Nota 2: ${miBundle.getDouble("Nota2")}\n" +
                    "Nota 3: ${miBundle.getDouble("Nota3")}\n" +
                    "Y su promedio de notas es de: ${miBundle.getDouble("Promedio")}"
        }
val botonSalir:Button=findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener { onClick() }
        }

    private fun onClick() {
        finish()
    }
}
