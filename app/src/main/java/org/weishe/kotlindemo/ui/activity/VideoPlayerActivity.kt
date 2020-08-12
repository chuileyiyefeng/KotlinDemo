package org.weishe.kotlindemo.ui.activity

import android.content.pm.ActivityInfo
import android.os.Build
import android.transition.Transition
import androidx.core.view.ViewCompat
import com.shuyu.gsyvideoplayer.utils.OrientationUtils
import kotlinx.android.synthetic.main.activity_video_play.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.utils.StatusBarUtil

/**
 * panyi crate on 2020.08.12 16:16
 * desc 视频播放页
 */
class VideoPlayerActivity : BaseActivity() {
    var itemBean: HomeDataBean.IssueListBean.ItemListBean? = null
    var orientationUtils: OrientationUtils? = null
    override fun bindLayout(): Int {
        return R.layout.activity_video_play
    }

    override fun initView() {
        StatusBarUtil.setStatusBarColor(this, R.color.color_black)
        StatusBarUtil.setStatusTextDark(this, false)
        initTransition()
    }

    override fun initData() {
        itemBean =
            intent.getSerializableExtra(StartKey.videoBean) as HomeDataBean.IssueListBean.ItemListBean?
    }

    private fun initTransition() {
        postponeEnterTransition()
        ViewCompat.setTransitionName(view_player, StartKey.video_transition)
        addTransitionListener()
        startPostponedEnterTransition()
    }

    private fun addTransitionListener() {
        val transition = window.sharedElementEnterTransition
        transition?.addListener(object : Transition.TransitionListener {
            override fun onTransitionResume(p0: Transition?) {
            }

            override fun onTransitionPause(p0: Transition?) {
            }

            override fun onTransitionCancel(p0: Transition?) {
            }

            override fun onTransitionStart(p0: Transition?) {
            }

            override fun onTransitionEnd(p0: Transition?) {
                loadVideoInfo()
                transition.removeListener(this)
            }

        })
    }

    private fun loadVideoInfo() {
        itemBean?.let {
            orientationUtils = OrientationUtils(this, view_player)
            view_player.setUp(it.data.playUrl, false, "")
            view_player.startPlayLogic()
            view_player.fullscreenButton.setOnClickListener {
                orientationUtils?.resolveByClick()
                //第一个true是否需要隐藏actionbar，第二个true是否需要隐藏statusbar
                view_player.startWindowFullscreen(this, true, true)
            }
        }
    }

    override fun doBusiness() {
    }
}