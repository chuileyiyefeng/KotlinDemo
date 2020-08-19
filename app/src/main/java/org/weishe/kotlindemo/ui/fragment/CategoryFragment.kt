package org.weishe.kotlindemo.ui.fragment

import android.content.Intent
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_attention.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.CategoryBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.CategoryContract
import org.weishe.kotlindemo.mvp.present.CategoryPresent
import org.weishe.kotlindemo.ui.activity.CategoryDetailActivity
import org.weishe.kotlindemo.ui.adapter.CategoryAdapter
import org.weishe.kotlindemo.view.MyItemDecoration

/**
 * panyi crate on 2020.08.17 15:49
 * desc 发现里分类fragment
 */
class CategoryFragment : BaseFragment(), CategoryContract.View, BaseAdapter.ItemClickListener {
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
        adapter?.let {
            it.itemClickListener = this
        }
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

    override fun itemClick(position: Int) {
        adapter?.let {
            val bean = it.getItem(position)
            val intent = Intent(context, CategoryDetailActivity::class.java)
            intent.putExtra(StartKey.categoryBean, bean)
            startActivity(intent)
        }
    }

}