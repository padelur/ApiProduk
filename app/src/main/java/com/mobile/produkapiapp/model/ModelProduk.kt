package com.mobile.produkapiapp.model

import java.io.Serializable

data class ModelProduk(
    val id : Int,
    val title : String,
    val description : String,
    val category : String,
    val price : Double,
    val stock : Int,
    val brand : String,
    val thumbnail : String,

): Serializable
