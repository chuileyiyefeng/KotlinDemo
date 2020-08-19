package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.HomeDataBean

/**
 * panyi crate on 2020.08.19 17:43
 * desc
 */
interface CategoryVideoListContract {
    interface View : IBaseView {
       fun setCategoryVideoList(result: HomeDataBean.IssueListBean)
    }

    interface Present {
        fun getCategoryVideoList(id:Int)
    }
}