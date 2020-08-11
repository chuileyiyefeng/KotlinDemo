package org.weishe.kotlindemo.http

import io.reactivex.Flowable
import io.reactivex.Observable
import org.weishe.kotlindemo.bean.HomeDataBean
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    /*获取每日精选*/
    @GET("v2/feed?")
    fun getDaily(): Flowable<HomeDataBean>

    /*获取根据url下一页数据*/
    @GET
    fun getMoreHomeData(@Url url: String): Observable<HomeDataBean>
}