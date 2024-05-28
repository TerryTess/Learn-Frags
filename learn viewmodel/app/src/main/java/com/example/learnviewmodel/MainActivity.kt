package com.example.learnviewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.learnviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewmodel: myViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)

        myViewmodel = ViewModelProvider(this).get(myViewmodel::class.java)
        binding.textView.text = myViewmodel.getInitialCounter().toString()
        binding.buttonIncrement.setOnClickListener{
            binding.textview1.text =myViewmodel.getUpdateCounter().toString()
        }
    }
}