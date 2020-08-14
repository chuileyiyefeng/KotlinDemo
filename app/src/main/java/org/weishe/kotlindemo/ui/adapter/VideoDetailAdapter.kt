package org.weishe.kotlindemo.ui.adapter

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.bean.ItemListBean
import org.weishe.kotlindemo.durationFormat
import org.weishe.kotlindemo.utils.ImageLoader

/**
 * panyi crate on 2020.08.13 18:01
 * desc 视频播放详情页的adapter
 */
class VideoDetailAdapter(context: Activity) :
    BaseAdapter<ItemListBean>(context) {
    private var isAddHeader = false
    // 视频信息，就是头
    private val videoInfo = 0
    // 相关视频
    private val videoRecommend = 1
    // 相关视频标题
    private val videoTitle = 2
    private val textCard = "textCard"
    private val videoSmallCard = "videoSmallCard"
    override fun bindLayout(): Int {
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val layout: Int = when (viewType) {
            videoInfo -> R.layout.adapter_video_info
            videoRecommend -> R.layout.adapter_video_recommend
            videoTitle -> R.layout.adapter_video_title_info
            else -> 0
        }
        return BaseViewHolder(LayoutInflater.from(context).inflate(layout, parent, false))
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        if (isAddHeader && getItemViewType(position) == videoInfo) {
            headBean?.let {
                holder.setText(R.id.tv_title, it.data.title)
                holder.setText(R.id.tv_desc, it.data.description)
                holder.setText(
                    R.id.tv_tag,
                    "#" + it.data.category + "/" + durationFormat(it.data.duration)
                )
                val ivHead: ImageView = holder.getView(R.id.iv_avatar)
                ImageLoader.loadUrlCircle(context, ivHead, it.data.author.icon)
                holder.setText(R.id.tv_author_name, it.data.author.name)
                holder.setText(R.id.tv_author_desc, it.data.author.descriptionX)
            }
        } else {
            val bean=getItem(position)
            when (getItemViewType(position)) {
                videoTitle -> {
                    holder.setText(R.id.tv_title, bean.data.text)
                }
                videoRecommend -> {
                    val ivCover: ImageView = holder.getView(R.id.iv_cover)
                    ImageLoader.loadUrlRound(context, ivCover, bean.data.cover.feed)
                    holder.setText(R.id.tv_title, bean.data.title)
                    holder.setText(
                        R.id.tv_tag,
                        "#" + bean.data.category + "/" + durationFormat(bean.data.duration)
                    )
                }
            }
        }
    }

    var headBean: HomeDataBean.IssueListBean.ItemListBean? = null
    fun setHeaderData(headBean: HomeDataBean.IssueListBean.ItemListBean) {
        if (isAddHeader) {
            return
        }
        this.headBean = headBean
        isAddHeader = true
        val bean = ItemListBean()
        list.add(0, bean)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        if (isAddHeader && position == 0) {
            return videoInfo
        }
        Log.e("type", getItem(position).type)
        when (getItem(position).type) {
            textCard -> {
                return videoTitle
            }
            videoSmallCard -> {
                return videoRecommend
            }
        }
        return videoRecommend
    }
}