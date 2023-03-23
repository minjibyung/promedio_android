package com.example.promedio_notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMensage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensage)

        val campoMensaje=findViewById<TextView>(R.id.txtMensaje)

        var miBundle: Bundle? =this.intent.extras

        if (miBundle != null) {
            campoMensaje.text="Hola ${miBundle.getString("Nombre")} Bienvenid@" +
                    "La materia a validar es ${miBundle.getString("Materia")}" +
                    "Las notas a validar son: Nota 1 ${miBundle.getString("Nota1")}" +
                    "Nota 2 ${miBundle.getString("Nota2")}\" +"


        }
    }
}