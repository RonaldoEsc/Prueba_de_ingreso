package com.hrec.pruebadeingreso.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hrec.pruebadeingreso.databinding.ActivityUserPostsBinding

class UserPostsActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserPostsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserPostsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}