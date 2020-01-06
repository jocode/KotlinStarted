package com.example.kotlinstarted

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlin.random.Random
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


// Clase Implicita de datos
data class Cursos(val nombre: String, val url:String)

class MainActivity : AppCompatActivity() {

    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin", "kotlin")
    var cursoActual = react.copy()

    val deportes = arrayOf("Futbol", "Voleibol", "Basketbol", "Ciclismo", "Natación", "Atletismo", "Beisbol")
    var colors = intArrayOf(
        Color.parseColor("#1a535c"),
        Color.parseColor("#4ecdc4"),
        Color.parseColor("#61304b"),
        Color.parseColor("#ff6b6b"),
        Color.parseColor("#274156"),
        Color.parseColor("#32a287"),
        Color.parseColor("#acf7c1")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val content = findViewById<ConstraintLayout>(R.id.content)
        val boton = findViewById<Button>(R.id.btnChangeMessage)
        boton.setOnClickListener {
            //v: View? -> verEnPantalla("Curso de ${react.nombre} en platzi.com/${react.url}")
            swithDeporte()
            boton.setTextColor(Color.WHITE)
        }
        //boton.text = todoLosCursos()
        boton.text = "Elije un deporte"

    }

    fun swithCurso(){
        when (cursoActual.url){
            "react" -> cursoActual = kot.copy()
            "kotlin" -> cursoActual = react.copy()
            else -> print("Esto nunca va a pasar")

        }
        verEnPantalla("Curso de ${cursoActual.nombre} en platzi.com/${cursoActual.url}")
    }

    fun swithDeporte(){
        val aleatorio = Random.nextInt(0, deportes.size-1)
        verEnPantalla(deportes[aleatorio])
        content.setBackgroundColor(colors[aleatorio])
    }

    fun verEnPantalla(data : String){
        var mensaje = findViewById<TextView>(R.id.mensaje)
        mensaje.setTextColor(Color.WHITE)
        mensaje.text = data
    }

    // Función inLine
    fun todoLosCursos() : String = "${react.nombre} & ${kot.nombre}"

}
