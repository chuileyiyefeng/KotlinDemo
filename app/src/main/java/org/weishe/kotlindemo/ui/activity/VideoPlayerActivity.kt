package org.weishe.kotlindemo.ui.activity

import android.content.Intent
import android.content.res.Configuration
import android.util.Log
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_video_play.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.bean.VideoRecommendBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.VideoPlayerContract
import org.weishe.kotlindemo.mvp.present.VideoPlayerPresent
import org.weishe.kotlindemo.ui.adapter.VideoDetailAdapter
import org.weishe.kotlindemo.utils.ImageLoader
import org.weishe.kotlindemo.utils.StatusBarUtil


/**
 * panyi crate on 2020.08.12 16:16
 * desc 视频播放页
 */
class VideoPlayerActivity : BaseActivity(), VideoPlayerContract.View,
    BaseAdapter.ItemClickListener {
    private var itemBean: HomeDataBean.IssueListBean.ItemListBean? = null
    private var present: VideoPlayerPresent? = null
    private var adapter: VideoDetailAdapter? = null

    override fun bindLayout(): Int {
        return R.layout.activity_video_play
    }

    override fun initView() {
        StatusBarUtil.setStatusBarColor(this, R.color.color_black)
        StatusBarUtil.setStatusTextDark(this, false)
        initTransition()
        present = VideoPlayerPresent()
        present?.attachView(this)
    }

    override fun initData() {
        setMyIntent(intent)
    }

    private fun setMyIntent(intent: Intent?) {
        itemBean =
            intent?.getSerializableExtra(StartKey.videoBean) as HomeDataBean.IssueListBean.ItemListBean?
        itemBean?.let {
            present?.setVideoPlayInfo(this, view_player, it)
            setVideoInfo(it)
            present?.getRecentRelatedVideo(it.data.id)
        }
        present?.let {
            lifecycle.addObserver(it)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        adapter?.clearAllItem()
        setMyIntent(intent)
    }

    // 进场动画
    private fun initTransition() {
        postponeEnterTransition()
        ViewCompat.setTransitionName(view_player, StartKey.video_transition)
        startPostponedEnterTransition()
    }

    // 设置视频信息
    private fun setVideoInfo(bean: HomeDataBean.IssueListBean.ItemListBean) {
        adapter = VideoDetailAdapter(this)
        rv_video_detail.layoutManager = LinearLayoutManager(this)
        rv_video_detail.adapter = adapter
        adapter?.setHeaderData(bean)
        adapter?.itemClickListener = this
        ImageLoader.loadUrl(this, iv_bg, bean.data.cover.blurred)
    }

    var isFullScreen = false
    override fun onBackPressed() {
        present?.let {
            isFullScreen = it.backToProtVideo()
        }
        if (!isFullScreen) {
            super.onBackPressed()
        }
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        //如果旋转了就全屏
        present?.onConfigurationChanged(newConfig)
    }


    override fun doBusiness() {
    }

    override fun setRecentRelatedVideo(bean: VideoRecommendBean) {
        bean.itemList.forEach {
            adapter?.addItem(it)
        }

    }

    override fun setErrorMsg(errorMsg: String) {
        Log.e("myTest", errorMsg)
    }

    override fun itemClick(position: Int) {
        adapter?.let {
            present?.startNewVideo(this, view_player, it.getItem(position).data)
        }
    }
}