package com.example.promedio_notas

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

        //val intent =Intent(this,ActivityMensage::class.java)
        //val miBundle:Bundle= Bundle()
       // miBundle.putString("Nombre","Materia","Nota1","Nota2")

        val campoNombre:EditText=findViewById(R.id.idNombre)
        val campoMateria:EditText=findViewById(R.id.idMateria)
        val campoNota1:EditText=findViewById(R.id.idNota1)
        val campoNota2:EditText=findViewById(R.id.idNota2)
        val campoNota3:EditText=findViewById(R.id.idNota3)

        val nombre:String=campoNombre.text.toString()
        val materia:String=campoMateria.text.toString()
        val nota1:Double=campoNota1.text.toString().toDouble()
        val nota2:Double=campoNota2.text.toString().toDouble()
        val nota3:Double=campoNota3.text.toString().toDouble()

        var prom:Double=(nota1+nota2+nota3)/3
        println("El promedio de notas es de: "+prom)

        if (prom>=3.5){
            println("EL ESTUDIANTE $nombre GANO LA MATERIA DE $materia CON UNA NOTA DE: "+prom)
        }else {
            println("EL ESTUDIANTE $nombre PERDIO LA MATERIA DE $materia CON UNA NOTA DE: " + prom)
        }
    Toast.makeText(this,"Hello $nombre",Toast.LENGTH_LONG).show()
    }

    }
