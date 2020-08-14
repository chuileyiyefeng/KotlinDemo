package org.weishe.kotlindemo.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import io.reactivex.disposables.CompositeDisposable
import org.weishe.kotlindemo.http.RetrofitUtils
import java.lang.ref.WeakReference

open class BasePresent<V : IBaseView> : IBasePresent<V>, LifecycleObserver {
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

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        detachView()
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