package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView

interface HomeContract {
    interface View : IBaseView {
        fun setData(string: String)
        fun setMoreData(string: String)
        fun showError()
    }

    interface Present {
        fun loadData()
        fun loadMoreData()
    }
}