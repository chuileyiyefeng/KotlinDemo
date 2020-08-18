package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.FollowItemBean

/**
 * panyi crate on 2020.08.17 16:39
 * desc
 */
interface FollowContract {
    interface View : IBaseView {
        fun setData(followBean: FollowItemBean)
        fun setMoreData(followBean: FollowItemBean)
    }

    interface Present {
        fun getFollowAuthor()
        fun getNextPage(url:String)
    }
}