package org.weishe.kotlindemo.mvp.present

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.util.Log
import androidx.annotation.MainThread
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.shuyu.gsyvideoplayer.GSYVideoManager
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack
import com.shuyu.gsyvideoplayer.utils.Debuger
import com.shuyu.gsyvideoplayer.utils.OrientationUtils
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.bean.RecommendDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.VideoPlayerContract
import org.weishe.kotlindemo.ui.activity.VideoPlayerActivity


/**
 * panyi crate on 2020.08.13 15:58
 * desc
 */
class VideoPlayerPresent : BasePresent<VideoPlayerContract.View>(), VideoPlayerContract.Present {
    var orientationUtils: OrientationUtils? = null
    private var isPlay = false
    private var isPause = false
    private var view: StandardGSYVideoPlayer? = null
    private var context: Activity? = null
    override fun getRecentRelatedVideo(id: Long) {
        RetrofitUtils.apiUrl?.let {
            it.getRecommendVideo(id)
                .compose(SchedulerUtils.ioToMain())
                .subscribe({
                    run {
                        getView()?.setRecentRelatedVideo(it)
                    }
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })

        }?.let {
            addSubscription(it)
        }
    }

    override fun setVideoPlayInfo(
        context: Activity,
        view: StandardGSYVideoPlayer,
        bean: HomeDataBean.IssueListBean.ItemListBean
    ) {
        this.context = context
        this.view = view
        bean.let { it ->
            orientationUtils = OrientationUtils(context, view)
            //初始化不打开外部的旋转
            orientationUtils?.let {
                it.isEnable = false
            }
            val gsyVideoOption = GSYVideoOptionBuilder()
            Log.e("PlayUrl",it.data.playUrl)
            gsyVideoOption
                .setIsTouchWiget(true)
                .setRotateViewAuto(false)
                .setLockLand(false)
                .setAutoFullWithSize(true)
                .setShowFullAnimation(false)
                .setNeedLockFull(true)
                .setUrl(it.data.playUrl)
                .setCacheWithPlay(false)
                .setVideoAllCallBack(object : GSYSampleCallBack() {
                    override fun onPrepared(url: String, vararg objects: Any) {
                        super.onPrepared(url, *objects)
                        //开始播放了才能旋转和全屏
                        orientationUtils?.isEnable = true
                        isPlay = true
                    }

                    override fun onQuitFullscreen(url: String, vararg objects: Any) {
                        super.onQuitFullscreen(url, *objects)
                        orientationUtils?.backToProtVideo()
                    }
                }).setLockClickListener { _, lock ->
                    //配合下方的onConfigurationChanged
                    orientationUtils?.let {
                        it.isEnable = !lock
                    }
                }.build(view)

            view.fullscreenButton
                .setOnClickListener {
                    //直接横屏
                    orientationUtils?.resolveByClick()
                    //第一个true是否需要隐藏actionbar，第二个true是否需要隐藏statusbar
                    view.startWindowFullscreen(context, true, true)
                }
            view.backButton.setOnClickListener {
                context.onBackPressed()
            }
            view.startPlayLogic()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        if (isPlay && !isPause) {
            view?.onConfigurationChanged(context, newConfig, orientationUtils, true, true)
        }
    }

    override fun backToProtVideo(): Boolean {
        orientationUtils?.let {
            it.backToProtVideo()
            // 返回是否是全屏
            if (GSYVideoManager.backFromWindowFull(context)) {
                return true
            }
        }
        return false
    }

    override fun startNewVideo(
        context: Activity,
        view: StandardGSYVideoPlayer,
        currentBean: RecommendDataBean
    ) {
        val itemListBean = HomeDataBean.IssueListBean.ItemListBean()
        val dataBean = HomeDataBean.IssueListBean.ItemListBean.DataBean()
        val authorBean = HomeDataBean.IssueListBean.ItemListBean.DataBean.AuthorBean()
        val coverBean = HomeDataBean.IssueListBean.ItemListBean.DataBean.CoverBean()
        dataBean.id = currentBean.id
        dataBean.playUrl = currentBean.playUrl
        dataBean.title = currentBean.title
        dataBean.description = currentBean.description
        dataBean.category = currentBean.category
        dataBean.duration = currentBean.duration

        authorBean.icon = currentBean.author.icon
        authorBean.name = currentBean.author.name
        authorBean.descriptionX = currentBean.author.description
        dataBean.author = authorBean

        coverBean.blurred = currentBean.cover.blurred
        dataBean.cover = coverBean

        itemListBean.data = dataBean
        val intent = Intent(context, VideoPlayerActivity::class.java)
        intent.putExtra(StartKey.videoBean, itemListBean)
        context.startActivity(intent)
    }


    // 绑定一些生命周期
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        view?.currentPlayer?.onVideoResume()
        isPause = false
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        view?.currentPlayer?.onVideoPause()
        isPause = true
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onStop() {
        view?.currentPlayer?.release()
    }
}