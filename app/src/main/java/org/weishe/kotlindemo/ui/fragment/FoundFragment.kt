package org.weishe.kotlindemo.ui.fragment

import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_found.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.ui.adapter.ViewPagerAdapter

/**
 * panyi crate on 2020.08.17 15:47
 * desc 发现的fragment
 */
class FoundFragment : BaseFragment() {
    override fun initView() {

    }

    override fun initData() {
        val stringList = ArrayList<String>()
        val fragmentList = ArrayList<Fragment>()
        fragmentList.add(FollowFragment())
        fragmentList.add(CategoryFragment())
        stringList.add("  关注  ")
        stringList.add("  分类  ")
        for (s in stringList) {
            tab_title.addTab(tab_title.newTab())
        }
        val adapter = ViewPagerAdapter(
            activity?.supportFragmentManager,
            fragmentList
        )
        vp_found.adapter = adapter
        tab_title.setupWithViewPager(vp_found)

        // 注释的为viewpager2绑定tabLayout的方法
//        val mediator =
//            TabLayoutMediator(tab_title, vp_found, object : TabLayoutMediator.TabConfigurationStrategy {
//                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
//                }
//            })
//        mediator.attach()
        for (i in stringList.indices) {
            tab_title.getTabAt(i)?.text = stringList.get(i)
        }
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_found
    }
}