package com.hrec.pruebadeingreso.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hrec.pruebadeingreso.database.DataBase
import com.hrec.pruebadeingreso.databinding.ActivityMainBinding
import com.hrec.pruebadeingreso.interfaces.ChangeActivities
import com.hrec.pruebadeingreso.models.UserResponse

class MainActivity : AppCompatActivity(), ChangeActivities {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val database = DataBase(this)
        setContentView(binding.root)
    }

    override fun onChangeActivity(user: UserResponse) {
        val intent = Intent(this, UserPostsActivity::class.java)
        intent.putExtra("model", user)
        startActivity(intent)
    }
}