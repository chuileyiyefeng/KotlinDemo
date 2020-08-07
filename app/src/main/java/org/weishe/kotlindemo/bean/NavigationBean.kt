package org.weishe.kotlindemo.bean

open class NavigationBean(
    var name: String,
    val selectId: Int,
    val unSelectId: Int,
    var isSelect: Boolean = false
)