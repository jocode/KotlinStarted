package com.crexative.ejemplokotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyAdapter (context : Context, list : Array<String>) : BaseAdapter() {

    var list:Array<String>
    private val inflator:LayoutInflater

    // Init es el bloque de inicio, como uns constructor
    init {
        this.inflator = LayoutInflater.from(context)
        this.list = list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view:View?
        val viewHolder:ViewHolder

        if (convertView==null) {
            view = this.inflator.inflate(R.layout.item, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        viewHolder.textItem.text = list[position]

        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    // El signo de interrogación  ? indica que puede ser nulo
    private class ViewHolder(row: View?){
        val textItem : TextView

        init {
            this.textItem = row?.findViewById(R.id.textItem)!!
        }
    }


}