package org.weishe.kotlindemo.ui.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Space
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.FollowItemBean
import org.weishe.kotlindemo.durationFormat
import org.weishe.kotlindemo.utils.ImageLoader

/**
 * panyi crate on 2020.08.17 18:09
 * desc
 */
class FollowChildAdapter(context: Context) :
    BaseAdapter<FollowItemBean.ItemListBeanX.DataBeanX.ItemListBean>(context) {
    override fun bindLayout(): Int {
        return R.layout.adapter_follow_child
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val bean = getItem(position).data
        holder.setText(R.id.tv_desc, bean.title)
        holder.setText(R.id.tv_tag, "#${bean.category}/${durationFormat(bean.duration)}")
        val ivCover = holder.getView<ImageView>(R.id.iv_cover)
        ImageLoader.loadUrlRound(context, ivCover, bean.cover.detail)
        val spaceHead = holder.getView<Space>(R.id.space_head)
        val spaceEnd = holder.getView<Space>(R.id.space_end)
        spaceHead.visibility = View.GONE
        spaceEnd.visibility = View.GONE
        when (position) {
            0 -> {
                spaceHead.visibility = View.VISIBLE
            }
            itemCount - 1 -> {
                spaceEnd.visibility = View.VISIBLE
            }
        }
    }
}