package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.TabDataBean

/**
 * panyi crate on 2020.08.19 10:32
 * desc  热门契约类
 */
interface PopularContract {
    interface View : IBaseView {
        fun setPopularTitle(bean: TabDataBean)
    }

    interface Present {
        fun getPopularTitle()
    }
}