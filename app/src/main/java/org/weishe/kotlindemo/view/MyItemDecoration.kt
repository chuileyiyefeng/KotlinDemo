package org.weishe.kotlindemo.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

/**
 * Created by Tmp on 2019/3/5.
 */
class MyItemDecoration : ItemDecoration {
    private var mPaint: Paint
    private var mDividerHeight = 2

    constructor() {
        mPaint = Paint()
        mPaint.color = Color.parseColor("#dddddd")
    }

    constructor(context: Context, dividerHeight: Int, color: Int) {
        mDividerHeight =
            (context.resources.displayMetrics.density * dividerHeight + 0.5f).toInt()
        mPaint = Paint()
        mPaint.color = context.resources.getColor(color,null)
    }

    //设置ItemView的内嵌偏移长度（inset）
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
    }

    //    绘制在子view的下层
    override fun onDraw(
        c: Canvas,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.onDraw(c, parent, state)
    }

    //    绘制在子view的上层
    override fun onDrawOver(
        c: Canvas,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.onDrawOver(c, parent, state)
        val childCount = parent.childCount
        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)
            // 画水平线
            val left = child.left
            val top = child.bottom
            val right = child.right
            val bottom = top + mDividerHeight
            c.drawRect(left.toFloat(), top.toFloat(), right.toFloat(), bottom.toFloat(), mPaint)
            //        画竖直线
            val top2 = child.top
            val right2 = child.right + mDividerHeight
            c.drawRect(right.toFloat(), top2.toFloat(), right2.toFloat(), top.toFloat(), mPaint)
        }
    }
}