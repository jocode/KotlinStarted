package com.crexative.ejemplokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.* // Importa las variables locales de otros métodos

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

    fun openListView(view: View) {
        val intent = Intent(this, ListViewExample::class.java)
        try {
            intent.putExtra("dato", editText.text.toString())
        }  catch (e:NumberFormatException){
            Log.e("TAG", "Error de parseo")
        }
        startActivity(intent)
    }
    fun openRecyclerView(view: View) {
        val intent = Intent(this, RecyclerExample::class.java)
        startActivity(intent)
        Toast.makeText(this, "Pasamos a Recycler", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "onDestroy")
    }
}