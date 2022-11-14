package com.example.electronicsrecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeTextView.text = getString(R.string.welcome_msg)

        btnBeauty.setOnClickListener {
            print("here")
            Toast.makeText(
                this,
                "You have chosen ${beauty.text.toString()} category of shopping",
                Toast.LENGTH_LONG
            ).show()
        }
        btnClothing.setOnClickListener {
            Toast.makeText(
                this,
                "You have chosen ${cloth.text} category of shopping",
                Toast.LENGTH_LONG
            ).show()
        }
        btnElectronics.setOnClickListener {
            Toast.makeText(
                this,
                "You have chosen ${elect.text} category of shopping",
                Toast.LENGTH_LONG
            ).show()
            showShopping()
        }
        btnFood.setOnClickListener {
            Toast.makeText(
                this,
                "You have chosen ${food.text} category of shopping",
                Toast.LENGTH_LONG
            ).show()
        }

    }
private fun showShopping() {
    val intent = Intent(this, ShoppingActivity::class.java)
    startActivity(intent)
}
}