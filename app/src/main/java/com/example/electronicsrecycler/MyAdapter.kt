package com.example.electronicsrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.electronicsrecycler.MyAdapter.*
import kotlinx.android.synthetic.main.item_list.view.*

class MyAdapter (var plist:ArrayList<Product>, private val clickListener: (product: Product) -> Unit): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent,false)
        return  MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.imageView.setImageResource(plist[position].image)
        holder.itemView.name.text = plist[position].Title
        holder.itemView.price.text = "$" + plist[position].price.toString()
        holder.itemView.color.text = plist[position].color

        holder.itemView.setOnClickListener(){
            clickListener(plist[position])
        }

    }
    override fun getItemCount(): Int {
     return plist.size
    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}