package com.mobile.produkapiapp.services

import com.mobile.produkapiapp.model.ResponseProduk
import retrofit2.Call
import retrofit2.http.GET

interface ProdukService {
    @GET("products")//endpoint
    fun getAllProduk() : Call<ResponseProduk>
}