package org.weishe.kotlindemo.mvp.present

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.weishe.kotlindemo.base.BasePresent
import org.weishe.kotlindemo.http.RetrofitUtils
import org.weishe.kotlindemo.mvp.contract.HomeContract

class HomePresent : BasePresent<HomeContract.View>(), HomeContract.Present {
    override fun loadData() {
        RetrofitUtils.apiUrl?.let {
            it.getDaily().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    run {
                        getView()?.setData(result)
                        Log.e("msg", result.nextPageUrl)
                    }
                }, { error ->
                    {

                    }
                })
        }


    }

    override fun loadMoreData(url: String) {
        RetrofitUtils.apiUrl?.let {
            it.getMoreHomeData(url).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ result ->
                    run {
                        getView()?.setMoreData(result)
                        Log.e("msg", result.nextPageUrl)
                    }
                }, { error ->
                    {

                    }
                })
        }
    }
}