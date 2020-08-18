package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.CategoryBean

/**
 * panyi crate on 2020.08.18 15:40
 * desc
 */
interface CategoryContract {
    interface View : IBaseView {
        fun setCategory(list:ArrayList<CategoryBean>)

    }

    interface Present {
        fun getCategory()
    }
}