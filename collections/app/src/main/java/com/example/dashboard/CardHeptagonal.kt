package com.example.dashboard

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class CardHeptagonal @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = 0xFF6200EE.toInt() // Purple color
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val path = Path()
        val width = width.toFloat()
        val height = height.toFloat()

        // Define the rectangular shape with one side as a triangle
        path.moveTo(0f, 0f)              // Top-left corner
        path.lineTo(width, 0f)           // Top-right corner
        path.lineTo(width, height)       // Bottom-right corner
        path.lineTo(width / 3, height)   // Move the point 1/3 from the left on the bottom side
        path.lineTo(0f, height / 3)      // Move the point 1/3 from the bottom on the left side
        path.close()                     // Close the path


        // Draw the path
        canvas.drawPath(path, paint)
    }
}
