package org.weishe.kotlindemo.http

import okhttp3.OkHttpClient
import org.weishe.kotlindemo.constant.ConstantUrl
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitUtils {
    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ConstantUrl.baseUrl)
            .client(initClient())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .readTimeout(ConstantUrl.DEFAULT_TIME, TimeUnit.SECONDS) //设置读取超时时间
            .connectTimeout(
                ConstantUrl.DEFAULT_TIME,
                TimeUnit.SECONDS
            ) //设置请求超时时间
            .writeTimeout(
                ConstantUrl.DEFAULT_TIME,
                TimeUnit.SECONDS
            ) //设置写入超时时间
            .addInterceptor(LogInterceptor()) //添加打印拦截器
//                .addInterceptor(new NullInterceptor())
            .retryOnConnectionFailure(true) //设置出现错误进行重新连接。
            .build()
    }

    companion object {
        var apiUrl: ApiService? = null
            get() {
                if (field == null) {
                    synchronized(RetrofitUtils::class.java) {
                        field =
                            RetrofitUtils().initRetrofit().create(
                                ApiService::class.java
                            )
                    }
                }
                return field
            }
            private set
    }
}