package org.weishe.kotlindemo.base

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import org.weishe.kotlindemo.http.RetrofitUtils
import java.lang.ref.WeakReference

open class BasePresent<V : IBaseView> : IBasePresent<V>, LifecycleObserver {
    private var weakReference: WeakReference<V>? = null
    private val apiService = RetrofitUtils.apiUrl
    private var compositeDisposable: CompositeDisposable = CompositeDisposable()
    override fun attachView(view: V) {
        weakReference = WeakReference(view)
    }

    override fun detachView() {
        weakReference?.clear()
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
            compositeDisposable.clear()
        }
    }

    protected fun getView(): V? {
        return weakReference?.get()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        detachView()
    }

    protected fun addSubscription(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

}