package org.weishe.kotlindemo.ui.activity

import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseActivity
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.bean.NavigationBean
import org.weishe.kotlindemo.showMineToast
import org.weishe.kotlindemo.ui.adapter.NavigationAdapter
import org.weishe.kotlindemo.ui.fragment.DailyFragment
import org.weishe.kotlindemo.ui.fragment.FoundFragment
import org.weishe.kotlindemo.ui.fragment.MineFragment
import org.weishe.kotlindemo.ui.fragment.PopularFragment

class MainActivity : BaseActivity(), BaseAdapter.ItemClickListener {
    lateinit var adapter: NavigationAdapter
    var dailyFragment: DailyFragment? = null
    var foundFragment: FoundFragment? = null
    var popularFragment: PopularFragment? = null
    var mineFragment: MineFragment? = null
    override fun bindLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        rv_nav.layoutManager = GridLayoutManager(this, 4)
        adapter = NavigationAdapter(this)
        adapter.itemClickListener = this
        rv_nav.adapter = adapter
    }

    override fun initData() {
        addData(R.string.daily, R.mipmap.ic_home_selected, R.mipmap.ic_home_normal, true)
        addData(R.string.found, R.mipmap.ic_discovery_selected, R.mipmap.ic_discovery_normal)
        addData(R.string.popular, R.mipmap.ic_hot_selected, R.mipmap.ic_hot_normal)
        addData(R.string.mine, R.mipmap.ic_mine_selected, R.mipmap.ic_mine_normal)
    }

    private fun addData(stringId: Int, selectId: Int, unSelectId: Int, isSelect: Boolean = false) {
        adapter.addItem(NavigationBean(getString(stringId), selectId, unSelectId, isSelect))
        showFragment(0)
    }

    private fun showFragment(i: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        hideFragment(transaction)
        when (i) {
            0 -> {
                dailyFragment?.let {
                    transaction.show(it)
                } ?: DailyFragment().let {
                    dailyFragment = it
                    transaction.add(R.id.fl_container, it, "Daily")

                }
            }
            1 -> {
                foundFragment?.let {
                    transaction.show(it)
                } ?: FoundFragment().let {
                    foundFragment = it
                    transaction.add(R.id.fl_container, it, "Found")
                }
            }
            2 -> {
                popularFragment?.let {
                    transaction.show(it)
                } ?: PopularFragment().let {
                    popularFragment = it
                    transaction.add(R.id.fl_container, it, "Popular")
                }
            }
            3 -> {
                mineFragment?.let {
                    transaction.show(it)
                } ?: MineFragment().let {
                    mineFragment = it
                    transaction.add(R.id.fl_container, it, "Mine")
                }
            }
        }
        transaction.commitNow()
    }

    private fun hideFragment(transaction: FragmentTransaction) {
        dailyFragment?.let { transaction.hide(it) }
        foundFragment?.let { transaction.hide(it) }
        popularFragment?.let { transaction.hide(it) }
        mineFragment?.let { transaction.hide(it) }
    }

    override fun doBusiness() {
    }

    override fun itemClick(position: Int) {
        showFragment(position)
    }
}
