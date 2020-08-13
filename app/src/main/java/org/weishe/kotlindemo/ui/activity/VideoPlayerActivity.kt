package org.weishe.kotlindemo.ui.activity

import android.content.res.Configuration
import android.transition.Transition
import androidx.core.view.ViewCompat
import com.shuyu.gsyvideoplayer.GSYVideoManager
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack
import com.shuyu.gsyvideoplayer.utils.Debuger
import com.shuyu.gsyvideoplayer.utils.OrientationUtils
import kotlinx.android.synthetic.main.activity_video_play.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.VideoPlayerContract
import org.weishe.kotlindemo.mvp.present.VideoPlayerPresent
import org.weishe.kotlindemo.utils.StatusBarUtil


/**
 * panyi crate on 2020.08.12 16:16
 * desc 视频播放页
 */
class VideoPlayerActivity : BaseActivity(), VideoPlayerContract.View {
    private var itemBean: HomeDataBean.IssueListBean.ItemListBean? = null
    private var present: VideoPlayerPresent? = null

    override fun bindLayout(): Int {
        return R.layout.activity_video_play
    }

    override fun initView() {
        StatusBarUtil.setStatusBarColor(this, R.color.color_black)
        StatusBarUtil.setStatusTextDark(this, false)
        initTransition()
    }

    override fun initData() {
        present = VideoPlayerPresent(this)
        present?.attachView(this)
        itemBean =
            intent.getSerializableExtra(StartKey.videoBean) as HomeDataBean.IssueListBean.ItemListBean?
        itemBean?.let {
            present?.setVideoInfo(this, view_player, it)
        }
        present?.let {
            lifecycle.addObserver(it)
        }
    }

    // 进场动画
    private fun initTransition() {
        postponeEnterTransition()
        ViewCompat.setTransitionName(view_player, StartKey.video_transition)
        startPostponedEnterTransition()
    }

    // 设置视频信息
    private fun setVideoInfo(bean: HomeDataBean.IssueListBean.ItemListBean) {

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

    override fun setRecentRelatedVideo() {

    }
}