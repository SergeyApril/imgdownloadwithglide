package com.example.imagefromweb

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun downloadImage(view: View) {
        var btnToLoadImage: Button = findViewById(R.id.btnToLoadImage)
        var etUrlInputArea: EditText = findViewById(R.id.etUrlInputArea)
        var ivImageFromInternet: ImageView = findViewById(R.id.ivImageFromInternet)
        var urlFromEditTextView : String = etUrlInputArea.text.toString()
        Glide.with(this)
                .load(urlFromEditTextView)
                .centerInside()
                .into(ivImageFromInternet)
        etUrlInputArea.setText("")
    }

}