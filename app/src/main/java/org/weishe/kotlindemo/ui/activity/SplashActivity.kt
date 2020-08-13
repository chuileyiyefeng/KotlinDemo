package org.weishe.kotlindemo.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import kotlinx.android.synthetic.main.actviity_splash.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.base.BaseSimpleActivity
import org.weishe.kotlindemo.utils.AppUtils

@SuppressLint("SetTextI18n")
class SplashActivity : BaseSimpleActivity() {
    var animation: AlphaAnimation? = null

    override fun initView() {
        tv_desc.text = getString(R.string.app_desc)
        tv_version.text = "v${AppUtils.getVersionName(this)}"
        animation = AlphaAnimation(0.1f, 1f)
        animation?.duration = 1000
        animation?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

            override fun onAnimationStart(animation: Animation?) {
            }

        })
        iv_icon.startAnimation(animation)

    }

    override fun initData() {
    }

    override fun doBusiness() {
    }


    override fun bindLayout(): Int {
        return R.layout.actviity_splash
    }
}