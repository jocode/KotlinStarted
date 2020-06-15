package com.crexative.ejemplokotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterRecycler(val publicacionList:ArrayList<Publicacion>) : RecyclerView.Adapter<MyAdapterRecycler.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(publicacionList[position]);
    }

    override fun getItemCount(): Int {
        return publicacionList.size
    }


    // Definición de la clase ViewHolder
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(publicacion : Publicacion) {
            val id = itemView.findViewById(R.id.id) as TextView
            val nombre = itemView.findViewById(R.id.nombre) as TextView
            val usuario = itemView.findViewById(R.id.usuario) as TextView
            val hora = itemView.findViewById(R.id.hora) as TextView
            val texto = itemView.findViewById(R.id.texto) as TextView

            id.text = publicacion.id.toString()
            nombre.text = publicacion.nombre
            usuario.text = publicacion.usuario
            hora.text = publicacion.hora.toString() + " hrs"
            texto.text = publicacion.texto
        }
    }

}