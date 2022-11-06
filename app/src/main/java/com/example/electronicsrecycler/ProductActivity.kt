package com.example.electronicsrecycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.product_activity.*

class ProductActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_activity)

        title = "Product"

        details_image.setImageResource(intent.getIntExtra("product_image", R.drawable.apple14))
        details_name.text = intent.getStringExtra("product_title")
        product.text = intent.getStringExtra("product_name")
        detail_color.text = intent.getStringExtra("product_color")
        detail_desc.text = intent.getStringExtra("product_desc")
        detail_id.text = intent.getStringExtra("product_id")
    }
}