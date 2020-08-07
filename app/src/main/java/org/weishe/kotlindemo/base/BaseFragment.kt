package org.weishe.kotlindemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    var v: View? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (v == null) {
            v = inflater.inflate(bindLayout(), container, false)
        } else {
            v?.let {
                val viewGroup = v?.parent as ViewGroup
                viewGroup.removeView(v)
            }
        }
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    abstract fun bindLayout(): Int

    abstract fun initView()

    abstract fun initData()



}