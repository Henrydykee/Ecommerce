package com.example.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.products_row.*
import kotlinx.android.synthetic.main.produt_details.*

class ProdutDetails:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produt_details)

        val title= intent.getStringExtra("title")
        val price= intent.getStringExtra("price")
        val photoUrl= intent.getStringExtra("photo_Url")

        product_name.text=title
        product_name.text= price
        Picasso.get().load(photoUrl).into(photo)

        check_avability.setOnClickListener {
            //alert Dialog builder
            AlertDialog.Builder(this)
                .setMessage("It is Available")
                .create()
                .show()
        }
    }

}