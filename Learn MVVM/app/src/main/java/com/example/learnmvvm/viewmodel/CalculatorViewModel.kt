package com.example.learnmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.learnmvvm.model.calculatorData

class CalculatorViewModel :ViewModel(){
    fun calculateSum(num1: Int, num2: Int):Int{
val sum = num1 + num2
        return num1 + num2

    }
}