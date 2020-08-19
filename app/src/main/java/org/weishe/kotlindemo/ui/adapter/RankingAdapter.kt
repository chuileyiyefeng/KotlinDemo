package org.weishe.kotlindemo.ui.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseViewHolder
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.durationFormat
import org.weishe.kotlindemo.ui.activity.VideoPlayerActivity
import org.weishe.kotlindemo.utils.ImageLoader

/**
 * panyi crate on 2020.08.19 10:08
 * desc 排行的item
 */
class RankingAdapter(context: Context) :
    BaseAdapter<HomeDataBean.IssueListBean.ItemListBean>(context), View.OnClickListener {
    override fun bindLayout(): Int {
        return R.layout.adapter_ranking
    }

    override fun bindHolder(holder: BaseViewHolder, position: Int) {
        val bean = getItem(position).data
        holder.setText(R.id.tv_title, bean.title)
        holder.setText(R.id.tv_desc, "# ${bean.category}/${durationFormat(bean.duration)}")
        val ivBg = holder.getView<ImageView>(R.id.iv_bg)
        ImageLoader.loadUrl(context, ivBg, bean.cover.detail)
        val parentView = holder.getView<ConstraintLayout>(R.id.parent)
        parentView.tag = position
        parentView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v?.let {
            val tag: Int = v.tag as Int
            val bean = getItem(tag)
            val intent = Intent(context, VideoPlayerActivity::class.java)
            intent.putExtra(StartKey.videoBean, bean)
            val pair = androidx.core.util.Pair(v, StartKey.video_transition)
            val activityOptions =
                ActivityOptionsCompat.makeSceneTransitionAnimation(context as Activity, pair)
            ActivityCompat.startActivity(context, intent, activityOptions.toBundle())
        }
    }
}