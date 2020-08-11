package org.weishe.kotlindemo.base

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.weishe.kotlindemo.http.BaseObserver
import org.weishe.kotlindemo.http.RetrofitUtils
import java.lang.ref.WeakReference

open class BasePresent<V : IBaseView> : IBasePresent<V> {
    private var weakReference: WeakReference<V>? = null
    private val apiService = RetrofitUtils.apiUrl
    private var disposable: CompositeDisposable? = null
    override fun attachView(view: V) {
        weakReference = WeakReference(view)
    }

    override fun detachView() {
        weakReference?.clear()
    }

     protected fun getView(): V? {
        return weakReference?.get()
    }

//    open fun addDisposable(observable: Observable<*>, observer: BaseObserver) {
//        if (disposable == null) {
//            disposable = CompositeDisposable()
//        }
//        disposable?.add(
//            observable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith<BaseObserver>(observer)
//        )
//    }
}