package com.example.promedio_notas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensage)

        val campoMensaje = findViewById<TextView>(R.id.txtMensaje)
        val mensajeAR = findViewById<TextView>(R.id.idmessage)

        val miBundle: Bundle? = this.intent.extras

        if (miBundle != null) {
            campoMensaje.text = "Hola ${miBundle.getString("Nombre")} Bienvenid@\n" +
                    "La materia a validar es: ${miBundle.getString("Materia")}\n" +
                    "Las notas a validar son: Nota 1: ${miBundle.getDouble("Nota1")}\n" +
                    "Nota 2: ${miBundle.getDouble("Nota2")}\n" +
                    "Nota 3: ${miBundle.getDouble("Nota3")}\n" +
                    "Y su promedio de notas es de: ${miBundle.getDouble("Promedio")}\n"
        }
        if (miBundle?.getString("prom")!!>=3.5.toString()) {
            mensajeAR.text="${miBundle.getString("message1")}\n"
            mensajeAR.setTextColor(Color.parseColor("#ffffff"))
        }else{
            mensajeAR.text="${miBundle.getString("message1")}\n"
            mensajeAR.setTextColor(Color.LTGRAY)
        }

        val botonSalir:Button=findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener { onClick() }
        }

    private fun onClick() {
        finish()
    }
}
