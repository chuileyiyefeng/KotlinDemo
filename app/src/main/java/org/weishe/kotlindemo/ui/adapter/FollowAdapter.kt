package org.weishe.kotlindemo.ui.adapter

import android.content.Context
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.FollowItemBean
import org.weishe.kotlindemo.utils.ImageLoader

/**
 * panyi crate on 2020.08.17 17:29
 * desc
 */
class FollowAdapter(context: Context) : BaseAdapter<FollowItemBean.ItemListBeanX>(context) {
    override fun bindLayout(): Int {
        return R.layout.adapter_follow
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val bean = getItem(position)
        holder.setText(R.id.tv_author_name, bean.data.header.title)
        holder.setText(R.id.tv_author_desc, bean.data.header.description)
        val ivHead = holder.getView<ImageView>(R.id.iv_avatar)
        ImageLoader.loadUrlCircle(context, ivHead, bean.data.header.icon)

        val rvAuthor = holder.getView<RecyclerView>(R.id.rv_author)
        rvAuthor.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val adapter=FollowChildAdapter(context)
        rvAuthor.adapter=adapter
        adapter.addItemList(bean.data.itemList)
    }
}