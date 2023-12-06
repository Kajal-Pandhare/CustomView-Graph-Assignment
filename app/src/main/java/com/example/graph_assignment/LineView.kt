package com.example.graph_assignment

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ImageView

class LineView(context: Context,attributeSet: AttributeSet?):androidx.appcompat.widget.AppCompatImageView(context,attributeSet) {

    constructor(context: Context) : this(context,null)

    var values : Array<Int>? = null

        set(value) {
            field = value
            invalidate()
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (values==null){
            return
        }
        val paint = Paint()
        paint.color = Color.BLUE

        val percToHeight  = height/100
        val lineWidth = width/values!!.size-1

        paint.strokeWidth = 10f

        for ((position,value)in values!!.withIndex()){

            val x1 = position * lineWidth.toFloat()
            val y1 = height - percToHeight * value.toFloat()

            if (position < values!!.size-1){
                val x2 = (position + 1) * lineWidth.toFloat()
                val y2 = height - percToHeight * values!![position+1].toFloat()

                canvas.drawLine(x1,y1,x2,y2,paint)
            }
        }
    }
}
