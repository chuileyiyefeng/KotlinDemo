package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.CategoryVideoListContract

/**
 * panyi crate on 2020.08.19 17:49
 * desc
 */
class CategoryVideoListPresent : BasePresent<CategoryVideoListContract.View>(),
    CategoryVideoListContract.Present {
    override fun getCategoryVideoList(id: Int) {
        RetrofitUtils.apiUrl?.let {
            it.getCategoryVideoList(id)
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setCategoryVideoList(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }
    }
}