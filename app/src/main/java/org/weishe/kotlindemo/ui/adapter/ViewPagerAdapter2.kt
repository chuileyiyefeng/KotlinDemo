package org.weishe.kotlindemo.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.util.*

/**
 * panyi crate on 2020.08.17 16:00
 * desc viewPager2的adapter
 */
class ViewPagerAdapter2(activity: FragmentActivity, var list: ArrayList<Fragment>) : FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}