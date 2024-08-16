package com.example.dashboard

import android.content.Context
import android.graphics.Canvas
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
        color = 0xFFFFFFFF.toInt() // White color
        style = Paint.Style.FILL
    }

    private val path = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val midx = width / 2f
        val midy = height / 2f
        val radius = Math.min(width, height) / 2f

        path.reset()
        for (i in 0 until 6) {
            val angle = Math.toRadians((60 * i).toDouble()).toFloat()
            val x = midx + (radius * Math.cos(angle.toDouble())).toFloat()
            val y = midy + (radius * Math.sin(angle.toDouble())).toFloat()

            if (i == 0) {
                path.moveTo(x, y)
            } else {
                path.lineTo(x, y)
            }
        }
        path.close()

        canvas.drawPath(path, paint)
    }
}
