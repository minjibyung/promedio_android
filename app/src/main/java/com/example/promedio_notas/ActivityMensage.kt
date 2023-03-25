package com.example.promedio_notas

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMensage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensage)

        val campoMensaje = findViewById<TextView>(R.id.txtMensaje)

        var miBundle: Bundle? = this.intent.extras


        if(miBundle != null){
            campoMensaje.text="Alumno: ${miBundle.getString("Nombre")} \nMateria: ${miBundle.getString("Materia")} \n\nSus notas: \nNota 1:  ${miBundle.getDouble("Nota1")} \nNota 2: ${miBundle.getDouble("Nota2")} \nNota 3:  ${miBundle.getDouble("Nota3")} \n\nPromedio: ${miBundle.getString("Promedio")} \n\nEl estado es: "

        }
        //Pintar texto
        val mensajeAR=findViewById<TextView>(R.id.idmessage)
        if(miBundle?.getString("Promedio")!! >= 3.5.toString()){
            mensajeAR.text=" ${miBundle?.getString("message")}"
            mensajeAR.setTextColor(Color.parseColor("#4CAF50"));
            mensajeAR.setTypeface(null, Typeface.BOLD);
        }else{
            mensajeAR.text=" ${miBundle?.getString("message")}"
            mensajeAR.setTypeface(null, Typeface.BOLD);
            mensajeAR.setTextColor(Color.parseColor("#C62828"));

        }
        val botonSalir:Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}

    }

    private fun onClick() {
        finish()
    }
}
