package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.CategoryContract

/**
 * panyi crate on 2020.08.18 15:47
 * desc
 */
class CategoryPresent : BasePresent<CategoryContract.View>(), CategoryContract.Present {
    override fun getCategory() {
        RetrofitUtils.apiUrl?.let {
            it.getCategory()
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setCategory(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }?.let {
            addSubscription(it)
        }
    }
}