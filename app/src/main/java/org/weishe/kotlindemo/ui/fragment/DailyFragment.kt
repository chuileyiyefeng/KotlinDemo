package org.weishe.kotlindemo.ui.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_daily.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.HomeDataBean
import org.weishe.kotlindemo.mvp.contract.HomeContract
import org.weishe.kotlindemo.mvp.present.HomePresent
import org.weishe.kotlindemo.ui.adapter.DailyFragmentAdapter
import org.weishe.kotlindemo.view.JumpLoadView

class DailyFragment : BaseFragment(), HomeContract.View, JumpLoadView.LoadListener {
    var present: HomePresent? = null
    var nextPageUrl = ""
    private var adapter: DailyFragmentAdapter? = null
    private var layoutManager: LinearLayoutManager? = null
    var lastShowPosition = -1
    var firstShowPosition = -1
    override fun initView() {
        jump_load.setLoadListener(this)
        jump_load.connect(rv_data)
        tv_month.text=""
        rv_data.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                layoutManager?.let { it ->
                    val firstPosition = it.findFirstVisibleItemPosition()
                    if (firstPosition < firstShowPosition) {
                        tv_month.visibility = View.GONE
                    }
                    adapter?.let {
                        if (it.getItemViewType(firstPosition) == it.HEADER) {
                            lastShowPosition = firstPosition
                            if (firstShowPosition == -1) {
                                firstShowPosition = firstPosition
                            }
                            tv_month.text = it.getItem(lastShowPosition).data.text
                            tv_month.visibility = View.VISIBLE
                        }
                    }
                }

            }
        })
    }

    override fun initData() {
        present = HomePresent()
        present?.let {
            it.attachView(this)
            it.loadData()
        }

        context?.let {
            adapter = DailyFragmentAdapter(it)
            layoutManager = LinearLayoutManager(context)
            rv_data.layoutManager = layoutManager
            rv_data.adapter = adapter
        }
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_daily
    }

    override fun loadMore() {
        present?.loadMoreData(nextPageUrl)
    }

    override fun refresh() {
        present?.loadData()
    }

    // 这个第一次的数据
    override fun setData(bean: HomeDataBean) {
        adapter?.let {
            it.clearAllItemNoRefresh()
            it.addItemList(bean.issueList[0].itemList)
        }
        nextPageUrl = bean.nextPageUrl
        present?.loadMoreData(nextPageUrl)
    }

    // 这是上拉更多的数据
    override fun setMoreData(bean: HomeDataBean) {
        adapter?.addItemList(bean.issueList[0].itemList)
        nextPageUrl = bean.nextPageUrl
        jump_load.reductionScroll()
    }

    override fun showError() {

    }
}