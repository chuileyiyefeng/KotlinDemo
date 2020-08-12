package org.weishe.kotlindemo.base

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.utils.StatusBarUtil

abstract class BaseActivity : AppCompatActivity() {
    @SuppressLint("SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindLayout())
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        // 白色通知栏 黑色字体
        StatusBarUtil.setStatusBarColor(this, R.color.color_white)
        StatusBarUtil.setStatusTextDark(this, true)
        initView()
        initData()
        doBusiness()
    }

    abstract fun bindLayout(): Int

    abstract fun initView()

    abstract fun initData()

    abstract fun doBusiness()

}