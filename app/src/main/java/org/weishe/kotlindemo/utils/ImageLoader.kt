package org.weishe.kotlindemo.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import org.weishe.kotlindemo.R

object ImageLoader {
    // 普通的加载图片
    fun loadUrl(
        context: Context?,
        view: ImageView?,
        url: String?,
        resId: Int = R.color.color_lighter_gray
    ) {
        Glide.with(context!!).load(url).placeholder(resId).into(view!!)
    }

    // 加载圆角图片
    fun loadUrlRound(
        context: Context?,
        view: ImageView?,
        url: String?,
        resId: Int = R.color.color_lighter_gray,
        radius: Int = 4
    ) {
        Glide.with(context!!).load(url).placeholder(resId)
            .transform(GlideRoundTransform(radius))
            .into(view!!)
    }

    // 加载圆形图片
    fun loadUrlCircle(
        context: Context?,
        view: ImageView?,
        url: String?,
        resId: Int = R.mipmap.ic_head
    ) {
        Glide.with(context!!).load(url).placeholder(resId)
            .apply(RequestOptions.bitmapTransform(CircleCrop())).into(view!!)
    }
}