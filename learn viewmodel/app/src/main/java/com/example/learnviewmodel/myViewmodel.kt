package com.example.learnviewmodel
import androidx.lifecycle.ViewModel
class myViewmodel :ViewModel (){
    private var counter = 0
    fun getInitialCounter(): Int{
        return counter
    }
fun getUpdateCounter() : Int{
    return ++counter
}
}
