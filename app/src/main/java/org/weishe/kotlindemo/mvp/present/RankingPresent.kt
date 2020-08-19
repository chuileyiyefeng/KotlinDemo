package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.ExceptionHandle
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.http.SchedulerUtils
import org.weishe.kotlindemo.mvp.contract.RankingContract

/**
 * panyi crate on 2020.08.19 11:23
 * desc
 */
class RankingPresent : BasePresent<RankingContract.View>(), RankingContract.Present {
    override fun getRankingData(url: String) {
        RetrofitUtils.apiUrl?.let {
            it.getRankData(url)
                .compose(SchedulerUtils.ioToMain())
                .subscribe({ result ->
                    getView()?.setRankingData(result)
                }, { throwable ->
                    getView()?.setErrorMsg(ExceptionHandle.handleException(throwable))
                })
        }
    }
}