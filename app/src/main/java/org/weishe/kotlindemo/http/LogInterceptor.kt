package org.weishe.kotlindemo.http

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.ResponseBody
import java.io.IOException

class LogInterceptor : Interceptor {
    private val TAG = "InterceptorLog"
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        val mediaType = response.body()!!.contentType()
        val content = response.body()!!.string()
        val request=chain.request()
        Log.e(TAG, "request Url ${request.url()}  response body:$content")
        return response.newBuilder()
            .body(
                ResponseBody.create(
                    mediaType,
                    content
                )
            ) //                .header("Authorization", Your.sToken)
            .build()
    }
}