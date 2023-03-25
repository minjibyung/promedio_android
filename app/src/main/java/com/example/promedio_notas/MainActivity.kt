package com.example.promedio_notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botonCalcular:Button= findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener{Calcular()}
    }

    private fun Calcular() {
        val campoTexto:EditText?=findViewById(R.id.idNombre)
        val campoMateria1:EditText?=findViewById(R.id.idMateria)
        val campoNota1:EditText?=findViewById(R.id.idNota1)
        val campoNota2:EditText?=findViewById(R.id.idNota2)
        val campoNota3:EditText?=findViewById(R.id.idNota3)


        val name = campoTexto?.text.toString()
        val subject = campoMateria1?.text.toString()
        val nota1:Double= campoNota1?.text.toString().toDouble()
        val nota2:Double= campoNota2?.text.toString().toDouble()
        val nota3:Double= campoNota3?.text.toString().toDouble()

        val intent = Intent(this,ActivityMensage::class.java)
        val miBundle:Bundle= Bundle()
        val prom:Double=(nota1+nota2+nota3)/3

        var message: String? = null



        if (prom>=3.5){
            message = "El estudiante aprobo"
        }else {
            message = "El estudiante no aprobo"
        }

        miBundle.putString("Nombre",name)
        miBundle.putString("Materia",subject)
        miBundle.putDouble("Nota1",nota1)
        miBundle.putDouble("Nota2",nota2)
        miBundle.putDouble("Nota3",nota3)
        miBundle.putDouble("Promedio",prom)
        miBundle.putString("message1",message)
        intent.putExtras(miBundle)
        startActivity(intent)


    }

    }
