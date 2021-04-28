package com.example.imagedatabiding

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.imagedatabiding.data.User
import com.example.imagedatabiding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("Rahul", "Kumar")

        binding.imageUrl = "https://rukminim1.flixcart.com/image/416/416/jzsqky80/sticker/r/z/t/god-sticker-medium-50-mordern-art324-rangoli-original-imafgj6yjpaghbua.jpeg"
    }
}