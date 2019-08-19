package com.example.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.products_row.*
import kotlinx.android.synthetic.main.produt_details.*

class ProdutDetails:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produt_details)

        val title= intent.getStringExtra("title")
        val price= intent.getStringExtra("price")
        product_name.text=title
        product_name.text= price.toString()

        check_avability.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("It is Available")
                .create()
                .show()
        }
    }

}