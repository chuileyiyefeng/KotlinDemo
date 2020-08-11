package org.weishe.kotlindemo.http

open class BaseResponseFunc<T> : Function1<BaseResponse<T>, T> {
    override fun invoke(p1: BaseResponse<T>): T {
        return  p1.getBean() as T
    }
}