package com.example.marvelcharacters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val products:List<products>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        val imageView:ImageView=itemView.findViewById(R.id.imageView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.prodact_item,parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p =products[position]

        holder.imageView.setImageResource(p.image)
    }

    override fun getItemCount(): Int = products.size
}