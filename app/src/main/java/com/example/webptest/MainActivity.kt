package com.example.webptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.img)
        GlideApp.with(imageView)
            .load("https://picnic-nl-dev-images.s3-eu-west-1.amazonaws.com/17ed4fbf0c4a4afed459552b78a466b24183a527c6f2d344abc8cb1db20dc1d9/tile-medium.webp")
            .into(imageView)
    }
}