package com.example.components

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.components.databinding.ActivityMainBinding
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomAppBar()
    }

    private fun setupBottomAppBar() {
        val bottomAppBar: BottomAppBar = binding.bottomAppBar
        bottomAppBar.setNavigationOnClickListener {


            bottomAppBar.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.menu_settings -> {
                        true
                    }

                    R.id.menu_about -> {
                        true

                    }

                    else -> false
                }
            }
            binding.fab.setOnClickListener {
            }
        }
    }
}
