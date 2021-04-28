package com.example.imagedatabiding.data

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

data class User(val user: String, val address: String)

@BindingAdapter("profileImage")
fun loadImage(view: ImageView, imageUrl: String) {
    Glide.with(view.context).load(imageUrl).into(view)
}