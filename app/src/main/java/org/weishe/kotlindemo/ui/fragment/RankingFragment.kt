package org.weishe.kotlindemo.ui.fragment

import android.app.Activity
import android.content.Intent
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_ranking.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseAdapter
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.RankDataBean
import org.weishe.kotlindemo.constant.StartKey
import org.weishe.kotlindemo.mvp.contract.RankingContract
import org.weishe.kotlindemo.mvp.present.RankingPresent
import org.weishe.kotlindemo.ui.activity.VideoPlayerActivity
import org.weishe.kotlindemo.ui.adapter.RankingAdapter
import org.weishe.kotlindemo.view.RecyclerLoadMoreListener

/**
 * panyi crate on 2020.08.19 09:58
 * desc
 */
class RankingFragment : BaseFragment(), RankingContract.View {
    val present by lazy {
        RankingPresent()
    }
    val adapter by lazy {
        activity?.let { RankingAdapter(it) }
    }
    var rankDataBean: RankDataBean? = null
    override fun bindLayout(): Int {
        return R.layout.fragment_ranking
    }

    override fun initView() {
        present.attachView(this)
        lifecycle.addObserver(present)
        val url: String? = arguments?.getString(StartKey.rankUrl)
        url?.let {
            present.getRankingData(it)
            rv_ranking.layoutManager = LinearLayoutManager(activity)
            rv_ranking.adapter = adapter
            rv_ranking.addOnScrollListener(object : RecyclerLoadMoreListener() {
                override fun loadMore() {
                    rankDataBean?.let {
                        if (!it.nextPageUrl.isEmpty()) {
                            present.getRankingData(it.nextPageUrl)
                        }
                    }
                }
            })
        }

    }

    override fun initData() {
    }

    override fun setRankingData(result: RankDataBean) {
        rankDataBean = result
        adapter?.addItemList(result.itemList)
    }

    override fun setErrorMsg(errorMsg: String) {
    }


}