package com.example.tess

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Rice", "Pilau", "eggs", "kuinama", "pineapple", "githeri") // Each food item should be a separate string

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selectedfoodtext = findViewById<TextView>(R.id.selectedfoodtext)
        selectedfoodtext.text = "chapati"
        selectedfoodtext.setTextColor(resources.getColor(R.color.Primary))

        val decideBtn = findViewById<Button>(R.id.decidebtn) // Assuming it's a Button
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.size)
            selectedfoodtext.text = foodList[randomFoodIndex]
        }

        val addFoodBtn = findViewById<Button>(R.id.addfoodbtn) // Assuming it's a Button
        val addFoodTxt = findViewById<TextView>(R.id.textfield) // Assuming it's a TextView
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text = ""
        }
    }
}
