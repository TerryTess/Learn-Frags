package com.example.components

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.components.databinding.ActivityMainBinding


class TopAppBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.handler = this


        val toolbar = binding.topAppBar
        toolbar.setOnMenuItemClickListener { menuitem ->
            when (menuitem.itemId) {
                R.id.favorite -> {
                    Toast.makeText(this, "Favorite Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
