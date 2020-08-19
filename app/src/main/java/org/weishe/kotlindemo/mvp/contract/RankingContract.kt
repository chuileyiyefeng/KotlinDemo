package org.weishe.kotlindemo.mvp.contract

import org.weishe.kotlindemo.base.IBaseView
import org.weishe.kotlindemo.bean.RankDataBean

/**
 * panyi crate on 2020.08.19 11:21
 * desc 排行契约类
 */
interface RankingContract {
    interface View : IBaseView {
        fun setRankingData(result: RankDataBean)
    }

    interface Present {
        fun getRankingData(url: String)
    }
}