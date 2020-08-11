package org.weishe.kotlindemo.http

import com.google.gson.JsonParseException
import io.reactivex.observers.DisposableObserver
import org.json.JSONException
import retrofit2.HttpException
import java.io.InterruptedIOException
import java.net.ConnectException
import java.net.UnknownHostException
import java.text.ParseException

abstract class BaseObserver<T> : DisposableObserver<BaseResponse<T>?>() {
    private val isShowDialog = false
    override fun onStart() {}
    override fun onNext(response: BaseResponse<T>) {}
    override fun onError(e: Throwable) {
        val be: BaseException = if (e is BaseException) {
            e
        } else {
            if (e is HttpException) { //HTTP错误
                BaseException(BaseException.BAD_NETWORK_MSG, e)
            } else if (e is ConnectException || e is UnknownHostException) { //连接错误
                BaseException(BaseException.CONNECT_ERROR_MSG, e)
            } else if (e is InterruptedIOException) { //连接超时
                BaseException(BaseException.CONNECT_TIMEOUT_MSG, e)
            } else if (e is JsonParseException || e is JSONException || e is ParseException) { //解析错误
                BaseException(BaseException.PARSE_ERROR_MSG, e)
            } else {
                BaseException(BaseException.OTHER_MSG, e)
            }
        }
        onError(be.errorMsg)
    }

    override fun onComplete() {}
    abstract fun onSuccess(o: T)
    abstract fun onError(msg: String?)
}