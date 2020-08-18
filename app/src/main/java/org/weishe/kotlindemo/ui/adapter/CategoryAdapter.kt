package org.weishe.kotlindemo.ui.adapter

import android.content.Context
import android.widget.ImageView
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.CategoryBean
import org.weishe.kotlindemo.utils.ImageLoader

/**
 * panyi crate on 2020.08.18 16:17
 * desc 分类adapter
 */
class CategoryAdapter(context: Context) : BaseAdapter<CategoryBean>(context) {
    override fun bindLayout(): Int {
        return R.layout.adapter_category
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val bean = getItem(position)
        val ivBg = holder.getView<ImageView>(R.id.iv_bg)
        ImageLoader.loadUrlRound(context, ivBg, bean.bgPicture)
        holder.setText(R.id.tv_title, "# ${bean.name}")
        holder.setText(R.id.tv_desc, bean.description)
    }
}