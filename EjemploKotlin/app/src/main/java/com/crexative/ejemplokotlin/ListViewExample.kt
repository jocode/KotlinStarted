package com.crexative.ejemplokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListViewExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view_example)

        val listView : ListView = findViewById(R.id.list_view);

        var list = arrayOf("Elemento 1", "Elemento 2", "Elemento 3",
            "Elemento 4", "Elemento 5", "Elemento 6",
            "Elemento 7", "Elemento 8", "Elemento 9",
            "Elemento 10", "Elemento 11", "Elemento 12",
            "Elemento 13", "Elemento 14", "Elemento 15",
            "Elemento 16", "Elemento 17", "Elemento 18")

        // Le añadimos el adaptador al ListView
        listView.adapter = MyAdapter(this, list)

    }
}