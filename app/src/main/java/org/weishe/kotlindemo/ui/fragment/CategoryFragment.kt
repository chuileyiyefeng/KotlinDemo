package org.weishe.kotlindemo.ui.fragment

import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_attention.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.CategoryBean
import org.weishe.kotlindemo.mvp.contract.CategoryContract
import org.weishe.kotlindemo.mvp.present.CategoryPresent
import org.weishe.kotlindemo.ui.adapter.CategoryAdapter
import org.weishe.kotlindemo.view.MyItemDecoration

/**
 * panyi crate on 2020.08.17 15:49
 * desc 发现里分类fragment
 */
class CategoryFragment : BaseFragment(), CategoryContract.View {
    val present by lazy {
        CategoryPresent()
    }
    val adapter by lazy {
        activity?.let {
            CategoryAdapter(it)
        }
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_attention
    }

    override fun initView() {
        rv_follow.layoutManager = GridLayoutManager(activity, 2)
        rv_follow.adapter = adapter
        activity?.let {
            rv_follow.addItemDecoration(MyItemDecoration(it, 2, R.color.color_white))
        }
    }

    override fun initData() {
        present.attachView(this)
        present.getCategory()
        lifecycle.addObserver(present)
    }

    override fun setCategory(list: ArrayList<CategoryBean>) {
        adapter?.addItemList(list)
    }

    override fun setErrorMsg(errorMsg: String) {
    }

}