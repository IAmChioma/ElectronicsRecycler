package com.example.electronicsrecycler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.shopping_activity.*

class ShoppingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_activity)


        val products=  ArrayList<Product>()
        products.add(Product("RGA Voyager", 35.00,"Black", R.drawable.voyager,"5555334455", "Introducing Voyager RGA" ))
        products.add(Product("HP Flyer laptop", 125.00,"Black & red",  R.drawable.laptop,"5555334452", "Introducing HD Fly player" ))
        products.add(Product("Sony HD", 45.00,"Black",  R.drawable.sony,"5555334453", "Introducing Sony HD" ))
        products.add(Product("Nokia smart watch", 35.00,"Black",  R.drawable.smartwatch,"5555334445", "Introducing Nokia smart watch" ))
        products.add(Product(" Apple IPhone 14", 999.00,"Black",  R.drawable.apple14,"5555334451", "Apple Iphone 14 classic" ))
        products.add(Product("HP Printer", 95.00,"Black",  R.drawable.hp_printer,"5555334450", "HP Printer" ))

        recyclerView1.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(products, clickListener = { product->
            showProductDetails(product)
        })
        recyclerView1.adapter = adapter
    }
    private fun showProductDetails(product: Product) {
        val intent = Intent(this, ProductActivity::class.java)
        intent.putExtra("product_image", product.image)
        intent.putExtra("product_title", product.Title)
        intent.putExtra("product_color", product.color)
        intent.putExtra("product_desc", product.desc)
        intent.putExtra("product_price", product.price)
        intent.putExtra("product_id", product.itemid)

        startActivity(intent)
    }


}