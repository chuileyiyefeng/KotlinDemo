package org.weishe.kotlindemo.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.durationFormat
import org.weishe.kotlindemo.utils.ImageLoader

class DailyFragmentAdapter(context: Context) :
    BaseAdapter<HomeDataBean.IssueListBean.ItemListBean>(context) {
    private val banner2 = "banner2"
    private val video = "video"
    private val textHeader = "textHeader"
    private val BANNER = 0
    private val VIDEO = 2
     val HEADER = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val layout = when (viewType) {
            BANNER -> {
                R.layout.adapter_daily_fragment_type_banner
            }
            HEADER -> {
                R.layout.adapter_daily_fragment_type_header
            }
            VIDEO -> {
                R.layout.adapter_daily_fragment_type_video
            }
            else -> {
                0
            }
        }
        return BaseViewHolder(LayoutInflater.from(context).inflate(layout, parent, false))
    }

    override fun bindLayout(): Int {
        return 0
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val itemListBean = getItem(position)
        when (getItemViewType(position)) {
            BANNER -> {
                val ivBanner =holder.getView<ImageView>(R.id.iv_banner)
                ImageLoader.loadUrl(context, ivBanner, itemListBean.data.image)
            }
            VIDEO -> {
                val ivCover = holder.getView<ImageView>(R.id.iv_cover)
                val ivAvatar = holder.getView<ImageView>(R.id.iv_avatar)
                ImageLoader.loadUrl(context, ivCover, itemListBean.data.cover.feed)
                ImageLoader.loadUrlCircleHolder(context, ivAvatar, itemListBean.data.author.icon)
                holder.setText(R.id.tv_title, itemListBean.data.title)
                holder.setText(R.id.tv_category, "# "+itemListBean.data.category)
                var tag = "#"
                itemListBean.data.tags.forEach {
                    tag += it.name + "/"
                }
                tag += durationFormat(itemListBean.data.duration)
                holder.setText(R.id.tv_tag, tag)
            }
            HEADER -> {
                holder.setText(R.id.tv_month, itemListBean.data.text)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        when (getItem(position).type) {
            banner2 -> {
                return BANNER
            }
            video -> {
                return VIDEO
            }
            textHeader -> {
                return HEADER
            }
        }
        return 0
    }
}