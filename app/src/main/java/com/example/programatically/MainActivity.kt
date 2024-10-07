package com.example.programatically

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var linearLayout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayout = findViewById(R.id.linearLayout)
//        setSupportActionBar()
        addTextView(getString(R.string.hello))
        addTextView(getString(R.string.from))
        addTextView(getString(R.string.terry))

    }
    private fun addTextView (label : String){
        val view = TextView(this)
        view.text = label
        view.textSize = 28f
        view.setTextColor(Color.parseColor("#ff0000"))
        linearLayout.addView(view )
    }
}