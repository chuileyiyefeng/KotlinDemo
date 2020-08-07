package org.weishe.kotlindemo.mvp.present

import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.mvp.contract.HomeContract

class HomePresent : BasePresent<HomeContract.View>(), HomeContract.Present {
    override fun loadData() {
        getView()?.setData("1111")
    }

    override fun loadMoreData() {
        getView()?.setData("222")
    }
}