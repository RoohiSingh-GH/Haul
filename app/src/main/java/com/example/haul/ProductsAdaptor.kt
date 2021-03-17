package com.example.haul

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.haul.model.Product
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_row.view.*

class ProductsAdaptor(private val products:ArrayList<Product>):RecyclerView.Adapter<ProductsAdaptor.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(products[position].photoURL).into(holder.image)
       // Picasso.with().load(products[position].photoURL).into(holder.image)
        holder.title.text = products[position].title
    }

    override fun getItemCount() : Int = products.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.photo
        val title: TextView = itemView.product_category

    }
}