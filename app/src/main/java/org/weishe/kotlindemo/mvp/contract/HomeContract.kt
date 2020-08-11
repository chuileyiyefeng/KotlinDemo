package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.HomeDataBean

interface HomeContract {
    interface View : IBaseView {
        fun setData(bean: HomeDataBean)
        fun setMoreData(bean: HomeDataBean)
        fun showError()
    }

    interface Present {
        fun loadData()
        fun loadMoreData(url:String)
    }
}