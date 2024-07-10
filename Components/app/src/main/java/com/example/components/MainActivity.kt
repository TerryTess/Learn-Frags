package com.example.components

import android.os.Bundle
import android.widget.Toast
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
        setupTopAppBar()
           }
    private fun setupTopAppBar() {
        setSupportActionBar(binding.topbar)

        binding.topbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search -> {
                    Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favorite -> {
                    Toast.makeText(this, "Favorite clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }


    private fun setupBottomAppBar() {
        val bottomAppBar: BottomAppBar = binding.bottomAppBar
        bottomAppBar.setNavigationOnClickListener {

            Toast.makeText(this, "Navigation icon clicked", Toast.LENGTH_SHORT).show()
        }

        bottomAppBar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_settings -> {
                    Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_about -> {
                    Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
           }
        }

        binding.fab.setOnClickListener {
            Toast.makeText(this, "FAB clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
