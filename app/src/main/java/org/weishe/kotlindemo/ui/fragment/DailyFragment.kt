package org.weishe.kotlindemo.ui.fragment

import kotlinx.android.synthetic.main.fragment_daily.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.mvp.contract.HomeContract
import org.weishe.kotlindemo.mvp.present.HomePresent
import org.weishe.kotlindemo.view.JumpLoadView

class DailyFragment : BaseFragment(), HomeContract.View, JumpLoadView.LoadListener {
    var present: HomePresent? = null
    override fun initView() {
        jump_load.setLoadListener(this)
    }

    override fun initData() {
        present = HomePresent()
        present?.let {
            it.attachView(this)
            it.loadData()
        }
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_daily
    }

    override fun loadMore() {

    }

    override fun refresh() {

    }

    override fun setData(string: String) {

    }

    override fun setMoreData(string: String) {
    }

    override fun showError() {
    }
}