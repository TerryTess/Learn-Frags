package com.example.washscreen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.CheckBox
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnClickListener { view ->
            val popupMenu = PopupMenu(this, view)
            val items = arrayOf("Rivers", "Well", "Dam") // List of items

            for (item in items) {
                popupMenu.menu.add(item)
            }

            popupMenu.setOnMenuItemClickListener { menuItem ->
                checkBox.text = menuItem.title
                true
            }

            popupMenu.show()
        }
    }
}
