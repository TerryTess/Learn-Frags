package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.awaitCancellation
import com.example.calculatorapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var canAddOperation = false
    private var canAddDecimal = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         fun numberAction(view :View)
        {
            if (view is Button)
            {
                if (view.text == ".")
                {
                    if (canAddDecimal)
                    binding.workingtextview.append(view.text)
                    canAddDecimal = true

                }
                else
               binding.workingtextview.append(view.text)
                canAddOperation = true
            }
        }
        fun operationAction(view :View){
            if (view is Button && canAddOperation)
            {
                binding.workingtextview.append(view.text)
                canAddOperation = false
                canAddDecimal = true
            }
        }
        fun allClearAction(view :View){
            binding.workingtextview.text = ""
            binding.resulttextview.text = ""
        }
        fun backSpaceAction(view :View) {
            val length = binding.workingtextview.length()
            if (length > 0) {
                binding.workingtextview.text = binding.workingtextview.text.subSequence(0, length - 1)
            }
        }
        fun equalsAction(view :View){}

    }
}