package org.weishe.kotlindemo.http

open class BaseResponse<T>  {
    private var errorCode = 0
    private var errorMsg: String? = null
    private var data: T? = null

    open fun getErrorCode(): Int {
        return errorCode
    }

    open fun setErrorCode(errorCode: Int) {
        this.errorCode = errorCode
    }

    open fun getErrorMsg(): String? {
        return if (errorMsg == null) "" else errorMsg
    }

    open fun setErrorMsg(errorMsg: String?) {
        this.errorMsg = errorMsg
    }

    open fun getBean(): T? {
        return data
    }

    open fun setBean(bean: T) {
        data = bean
    }
}

