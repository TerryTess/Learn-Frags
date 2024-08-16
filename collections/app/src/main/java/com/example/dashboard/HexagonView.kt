package com.example.dashboard
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class HexagonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE // Replace with your desired color
        style = Paint.Style.FILL
    }
    private val path = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width.toFloat()
        val height = height.toFloat()

        // Hexagon drawing logic
        path.reset()
        path.moveTo(width / 2, 0f)
        path.lineTo(width, height / 4)
        path.lineTo(width, 3 * height / 4)
        path.lineTo(width / 2, height)
        path.lineTo(0f, 3 * height / 4)
        path.lineTo(0f, height / 4)
        path.close()

        canvas.drawPath(path, paint)
    }
}