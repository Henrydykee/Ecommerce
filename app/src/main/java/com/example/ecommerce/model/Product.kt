package com.example.ecommerce.model

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("name")
    val tittle:String,

    @SerializedName("photo_url")
    val photoUrl:String,

    val price:Double)