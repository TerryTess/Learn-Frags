package com.example.dashboard


import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.example.dashboard.R

class HexagonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val hexagonPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = ContextCompat.getColor(context, R.color.white)  // Hexagon color
        style = Paint.Style.FILL
    }

    private val path = Path()

    // Bitmap for the image
    private val bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.img)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width.toFloat()
        val height = height.toFloat()

        // Define the hexagonal path
        path.reset()
        path.moveTo(width / 2, 0f)
        path.lineTo(width, height / 4)
        path.lineTo(width, 3 * height / 4)
        path.lineTo(width / 2, height)
        path.lineTo(0f, 3 * height / 4)
        path.lineTo(0f, height / 4)
        path.close()

        // Draw the hexagon
        canvas.drawPath(path, hexagonPaint)

        // Clip the canvas to the hexagon shape to ensure the image is drawn inside it
        canvas.save()
        canvas.clipPath(path)

        // Scale and draw the image inside the hexagon
        val scaledBitmap = Bitmap.createScaledBitmap(bitmap, width.toInt(), height.toInt(), true)
        canvas.drawBitmap(scaledBitmap, 0f, 0f, null)

        // Restore the canvas to avoid affecting other drawing operations
        canvas.restore()
    }
}