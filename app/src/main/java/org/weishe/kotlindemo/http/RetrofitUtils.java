package org.weishe.kotlindemo.http;


import org.weishe.kotlindemo.constant.ConstantUrl;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    private static ApiService apiUrl;

    public static ApiService getApiUrl() {

        if (apiUrl == null) {
            synchronized (RetrofitUtils.class) {
                apiUrl = new RetrofitUtils().initRetrofit().create(ApiService.class);
            }
        }
        return apiUrl;
    }

    private Retrofit initRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(ConstantUrl.baseUrl)
                .client(initClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private OkHttpClient initClient() {
        return new OkHttpClient().newBuilder()
                .readTimeout(ConstantUrl.DEFAULT_TIME, TimeUnit.SECONDS)//设置读取超时时间
                .connectTimeout(ConstantUrl.DEFAULT_TIME, TimeUnit.SECONDS)//设置请求超时时间
                .writeTimeout(ConstantUrl.DEFAULT_TIME, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(new LogInterceptor())//添加打印拦截器
//                .addInterceptor(new NullInterceptor())
                .retryOnConnectionFailure(true)//设置出现错误进行重新连接。
                .build();
    }
}
