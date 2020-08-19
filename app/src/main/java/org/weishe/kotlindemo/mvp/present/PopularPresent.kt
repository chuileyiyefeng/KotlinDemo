package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.PopularContract

/**
 * panyi crate on 2020.08.19 10:43
 * desc 排行
 */
class PopularPresent : BasePresent<PopularContract.View>(), PopularContract.Present {
    override fun getPopularTitle() {
        RetrofitUtils.apiUrl?.let {
            it.getRankList()
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setPopularTitle(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }?.let { addSubscription(it) }
    }
}