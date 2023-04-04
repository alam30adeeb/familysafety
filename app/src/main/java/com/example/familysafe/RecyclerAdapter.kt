package com.example.familysafe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val listItems: List<RecyclerModelClass>) :RecyclerView.Adapter<RecyclerAdapter.Viewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.recycler_view_familymembers,parent,false)
        return Viewholder(item)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.recycler_name.text= listItems[position].name
    }

    class Viewholder(private val item:View):RecyclerView.ViewHolder(item){
        val recycler_name = item.findViewById<TextView>(R.id.recycler_name)
        val recycler_image = item.findViewById<ImageView>(R.id.recycler_image)
    }
}