package org.weishe.kotlindemo.ui.adapter

import android.app.Activity
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.HomeDataBean

/**
 * panyi crate on 2020.08.13 18:01
 * desc
 */
class VideoDetailAdapter(context: Activity) :
    BaseAdapter<HomeDataBean.IssueListBean.ItemListBean.DataBean.TagsBean>(context) {
    var isAddHeader = false
    override fun bindLayout(): Int {
        return R.layout.adapter_video_recommend
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {

    }

    fun setHeaderData(headBean: HomeDataBean.IssueListBean.ItemListBean) {
        if (isAddHeader) {
            return
        }
        isAddHeader = true
        list.add(0, getItem(0))
        notifyItemChanged(0)
    }

    override fun getItemViewType(position: Int): Int {

        return super.getItemViewType(position)
    }
}