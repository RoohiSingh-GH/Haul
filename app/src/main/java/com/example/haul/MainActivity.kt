package com.example.haul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.haul.model.Product
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val products = arrayListOf<Product>()

        for(i in 0..100){
            products.add(Product("Jacket","http://picsum.photos/id/237/200/300",1.90))
            products.add(Product("Jack","http://via.placeholder.com/150",1.90))
        }

recycler_view_products.apply {
    layoutManager = GridLayoutManager(this@MainActivity,2)
    adapter = ProductsAdaptor(products)
}

    }


}