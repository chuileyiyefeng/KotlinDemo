package org.weishe.kotlindemo.mvp.contract

import android.app.Activity
import android.content.res.Configuration
import com.shuyu.gsyvideoplayer.utils.OrientationUtils
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.HomeDataBean

/**
 * panyi crate on 2020.08.13 14:56
 * desc 视频播放与详情契约类
 */
interface VideoPlayerContract {
    interface View : IBaseView {
        fun setRecentRelatedVideo()
    }

    interface Present {
        fun getRecentRelatedVideo()
        fun setVideoInfo(
            context: Activity,
            view: StandardGSYVideoPlayer,
            bean: HomeDataBean.IssueListBean.ItemListBean
        )
        fun  onConfigurationChanged(newConfig: Configuration)
        fun backToProtVideo():Boolean
    }
}