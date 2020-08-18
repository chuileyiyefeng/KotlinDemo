package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.FollowContract

/**
 * panyi crate on 2020.08.17 16:45
 * desc
 */
class FollowPresent : BasePresent<FollowContract.View>(), FollowContract.Present {
    override fun getFollowAuthor() {
        RetrofitUtils.apiUrl?.let {
            it.getFollowAuthor()
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setData(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }?.let {
            addSubscription(it)
        }
    }

    override fun getNextPage(url: String) {
        RetrofitUtils.apiUrl?.let {
            it.getMoreFollow(url)
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setMoreData(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }?.let {
            addSubscription(it)
        }
    }

}