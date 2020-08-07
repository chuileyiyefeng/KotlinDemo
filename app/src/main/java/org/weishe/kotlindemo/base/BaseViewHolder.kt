package org.weishe.kotlindemo.base

import android.util.SparseArray
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val mViews = SparseArray<View>()

    fun setText(id: Int, text: String) {
        val tv: TextView = itemView.findViewById(id)
        tv.text = text
    }

    fun <T : View> getView(viewId: Int): T {
        var view = mViews.get(viewId)
        if (view == null) {
            view = itemView.findViewById(viewId)
            mViews.put(viewId, view)
        }
        return view as T
    }

}