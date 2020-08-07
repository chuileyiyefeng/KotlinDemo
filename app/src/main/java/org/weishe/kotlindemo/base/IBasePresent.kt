package org.weishe.kotlindemo.base

interface IBasePresent<V : IBaseView> {
    fun attachView(view: V)
    fun detachView()
}