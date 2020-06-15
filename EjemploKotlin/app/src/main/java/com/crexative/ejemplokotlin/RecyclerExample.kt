package com.crexative.ejemplokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_example)

        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val publicaciones = ArrayList<Publicacion>()
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))
        publicaciones.add(Publicacion(1, "Juan perex", "@jocode", 12, ">Había una vez una historia repetida"))

        val adapter = MyAdapterRecycler(publicaciones)
        recyclerView.adapter = adapter


    }
}