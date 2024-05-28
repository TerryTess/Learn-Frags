package com.example.learnmvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.learnmvvm.R
import com.example.learnmvvm.databinding.ActivityMainBinding
import com.example.learnmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider( this).get(calculatorViewModel::class.java)

binding.buttoncalculate.setOnClickListener {
    val num1 = binding.editText1.text.toString().toIntOrNull() ?: 0
    val num2 = binding.editText2.text.toString().toIntOrNull() ?: 0


    val result = calculatorViewModel.calculateSum(num1,num2)
    binding.textview1.text = result.toString()

}

    }
}