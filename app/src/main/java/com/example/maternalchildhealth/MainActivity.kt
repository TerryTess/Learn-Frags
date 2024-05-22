package com.example.maternalchildhealth

import android.graphics.drawable.DrawableContainer
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private lateinit var container: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        container = findViewById(R.id.linearLayout)

        addTextView(label = "Hello")
        addTextView(label = "Terry")
        addTextView(label = "Quentin")
    }

    private fun addTextView(label: String) {
        val view = TextView(this)
        view.text = label
        view.textSize = 28f
        container.addView(view)
    }
}
