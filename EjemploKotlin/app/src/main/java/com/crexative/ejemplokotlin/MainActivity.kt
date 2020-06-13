package com.crexative.ejemplokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.textView)
        val editText:EditText = findViewById(R.id.editText)
        val button:Button = findViewById(R.id.button)

        // ImageView en Kotlin
        val imageView:ImageView =  findViewById(R.id.imageView)
        var contador = 0

        button.setOnClickListener(View.OnClickListener {

            textView.text = editText.text

            val items = listOf("A", "B", "C", "D")
            for (item in items){
                Log.e("TAG", item)
            }
        })

        imageView.setOnClickListener {
            imageView.setImageResource(R.drawable.ic_launcher_background)
            contador+= 1
            textView.text = contador.toString()
        }

    }

}