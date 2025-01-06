package com.mobile.produkapiapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.mobile.produkapiapp.model.ModelProduk

class DetailPage : AppCompatActivity() {

    private lateinit var imgThumbnail: ImageView
    private lateinit var txtTitle: TextView
    private lateinit var txtBrand: TextView
    private lateinit var txtPrice: TextView
    private lateinit var txtStock: TextView
    private lateinit var txtCategory: TextView
    private lateinit var txtDescription: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        // Hubungkan dengan View
        imgThumbnail = findViewById(R.id.imgThumbnail)
        txtTitle = findViewById(R.id.txtTitle)
        txtBrand = findViewById(R.id.txtBrand)
        txtPrice = findViewById(R.id.txtPrice)
        txtStock = findViewById(R.id.txtStock)
        txtCategory = findViewById(R.id.txtCategory)
        txtDescription = findViewById(R.id.txtDescription)

        // Ambil data produk dari intent
        val produk = intent.getSerializableExtra("EXTRA_PRODUK") as? ModelProduk


        produk?.let {
            // Tampilkan data produk di halaman detail
            txtTitle.text = it.title
            txtBrand.text = "Brand: ${it.brand}"
            txtPrice.text = "Price: $${it.price}"
            txtStock.text = "Stock: ${it.stock}"
            txtCategory.text = "Category: ${it.category}"
            txtDescription.text = it.description

            Glide.with(this)
                .load(it.thumbnail)
                .centerCrop()
                .into(imgThumbnail)
        }
    }
}