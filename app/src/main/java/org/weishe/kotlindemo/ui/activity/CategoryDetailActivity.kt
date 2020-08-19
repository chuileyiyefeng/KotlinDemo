package org.weishe.kotlindemo.ui.activity

import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.bean.CategoryBean
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.CategoryVideoListContract
import org.weishe.kotlindemo.mvp.present.CategoryVideoListPresent

/**
 * panyi crate on 2020.08.19 15:15
 * desc 分类详情
 */
class CategoryDetailActivity : BaseActivity(), CategoryVideoListContract.View {
    var bean: CategoryBean? = null
    val present by lazy {
        CategoryVideoListPresent()
    }

    override fun bindLayout(): Int {
        return R.layout.activity_caterory_detail
    }

    override fun initView() {
    }

    override fun initData() {
        bean = intent.getSerializableExtra(StartKey.categoryBean) as CategoryBean
        bean?.let {
            present.attachView(this)
            present.getCategoryVideoList(it.id)
            lifecycle.addObserver(present)
        }

    }

    override fun doBusiness() {
    }


    override fun setCategoryVideoList(result: HomeDataBean.IssueListBean) {

    }

    override fun setErrorMsg(errorMsg: String) {
    }
}