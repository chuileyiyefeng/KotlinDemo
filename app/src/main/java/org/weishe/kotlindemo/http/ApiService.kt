package org.weishe.kotlindemo.http

import io.reactivex.Flowable
import retrofit2.http.GET

interface ApiService {
    /*获取每日精选*/
    @GET("v2/feed?")
    fun getDaily(): Flowable<BaseResponse>
}