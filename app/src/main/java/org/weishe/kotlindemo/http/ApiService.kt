package org.weishe.kotlindemo.http

import io.reactivex.Observable
import org.weishe.kotlindemo.bean.*
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {
    /*获取每日精选*/
    @GET("v2/feed?")
    fun getDaily(): Observable<HomeDataBean>

    /*获取根据url 获取首页下一页数据*/
    @GET
    fun getMoreHomeData(@Url url: String): Observable<HomeDataBean>

    /*获取当前播放视频的相关推荐视频*/
    @GET("v4/video/related?")
    fun getRecommendVideo(@Query("id") id: Long): Observable<VideoRecommendBean>

    /*获取关注的作者*/
    @GET("v4/tabs/follow")
    fun getFollowAuthor(): Observable<FollowItemBean>

    /*获取根据url 关注下一页数据*/
    @GET
    fun getMoreFollow(@Url url: String): Observable<FollowItemBean>

    /* 获取分类*/
    @GET("v4/categories")
    fun getCategory(): Observable<ArrayList<CategoryBean>>

    /*获取全部排行标题*/
    @GET("v4/rankList")
    fun getRankList(): Observable<TabDataBean>

    /*获取全部排行信息*/
    @GET
    fun getRankData(@Url url: String): Observable<RankDataBean>

    /*获取分类的列表*/
    @GET("v4/categories/videoList?")
    fun getCategoryVideoList(@Query("id") id: Int): Observable<HomeDataBean.IssueListBean>

}