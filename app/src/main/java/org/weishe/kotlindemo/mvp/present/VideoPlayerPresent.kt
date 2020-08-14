package org.weishe.kotlindemo.mvp.present

import android.app.Activity
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
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.mvp.contract.VideoPlayerContract


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
            it.getRecommendVideo(id).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    run {
                        getView()?.setRecentRelatedVideo(it)
                    }
                }, {

                })

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
                        Debuger.printfError("***** onQuitFullscreen **** " + objects[0]) //title
                        Debuger.printfError("***** onQuitFullscreen **** " + objects[1]) //当前非全屏player
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
        orientationUtils?.backToProtVideo()
        // 返回是否是全屏
        if (GSYVideoManager.backFromWindowFull(context)) {
            return true
        }
        return false
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