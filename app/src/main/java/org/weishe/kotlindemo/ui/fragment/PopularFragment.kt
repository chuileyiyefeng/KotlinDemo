package org.weishe.kotlindemo.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_found.*
import kotlinx.android.synthetic.main.fragment_found.tab_title
import kotlinx.android.synthetic.main.fragment_popular.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.TabDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.PopularContract
import org.weishe.kotlindemo.mvp.present.PopularPresent
import org.weishe.kotlindemo.ui.adapter.ViewPagerAdapter
import org.weishe.kotlindemo.ui.adapter.ViewPagerAdapter2

class PopularFragment : BaseFragment(), PopularContract.View {
    val present by lazy {
        PopularPresent()
    }
    private val stringList = ArrayList<String>()
    private val fragmentList = ArrayList<Fragment>()
    override fun initView() {
    }

    override fun initData() {
        present.attachView(this)
        lifecycle.addObserver(present)
        present.getPopularTitle()
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_popular
    }

    override fun setPopularTitle(bean: TabDataBean) {
        bean.tabInfo.tabList.forEach {
            stringList.add(it.name)
            tab_title.addTab(tab_title.newTab())
            val fragment = RankingFragment()
            val bundle = Bundle()
            bundle.putString(StartKey.rankUrl, it.apiUrl)
            fragment.arguments = bundle
            fragmentList.add(fragment)
        }
        activity?.let {
            val adapter = ViewPagerAdapter2(it, fragmentList)
            vp_popular.adapter = adapter
        }
        val mediator =
            TabLayoutMediator(
                tab_title,
                vp_popular,
                TabLayoutMediator.TabConfigurationStrategy { _, _ -> })
        mediator.attach()
        for (i in stringList.indices) {
            tab_title.getTabAt(i)?.text = stringList.get(i)
        }
    }

    override fun setErrorMsg(errorMsg: String) {

    }
}