package org.weishe.kotlindemo.ui.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.NavigationBean

class NavigationAdapter(context: Context) : BaseAdapter<NavigationBean>(context){
    var lastSelection = 0
    override fun bindLayout(): Int {
        return R.layout.adapter_navigation
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val bean = getItem(position)
        val imageView = holder.getView<ImageView>(R.id.iv_icon)
        val textVIew = holder.getView<TextView>(R.id.tv_title)
        holder.setText(R.id.tv_title, bean.name)
        if (bean.isSelect) {
            imageView.setImageResource(getItem(position).selectId)
            textVIew.setTextColor(context.resources.getColor(R.color.color_black))
        } else {
            imageView.setImageResource(getItem(position).unSelectId)
            textVIew.setTextColor(context.resources.getColor(R.color.color_light_black))
        }
    }
    override fun itemClick(position: Int){
        if (position != lastSelection) {
            getItem(position).isSelect = true
            getItem(lastSelection).isSelect = false
            notifyItemChanged(position)
            notifyItemChanged(lastSelection)
        }
        lastSelection = position
    }

}