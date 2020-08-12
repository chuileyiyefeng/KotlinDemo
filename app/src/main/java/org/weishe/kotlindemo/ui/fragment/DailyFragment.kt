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
    var currentShowPosition = -1
    var firstShowPosition = -1
    private val titlePositionList = ArrayList<Int>()
    // 设置悬浮标题为单次
    var onceSetTitle = true
    //  上次滑动到的位置是否是悬浮标题
    var lastIsHead = false

    override fun initView() {
        jump_load.setLoadListener(this)
        jump_load.connect(rv_data)
        tv_month.text = ""
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
                            lastIsHead = true
                            currentShowPosition = firstPosition
                            if (firstShowPosition == -1) {
                                firstShowPosition = firstPosition
                            }
                            titlePositionList.add(currentShowPosition)
                            tv_month.text = it.getItem(currentShowPosition).data.text
                            tv_month.visibility = View.VISIBLE
                            // 2 4 6
                            onceSetTitle = true
                        } else {
//                            dy<0手指向下拉
                            if (dy < 0 && lastIsHead && onceSetTitle) {
                                val position = titlePositionList.indexOf(currentShowPosition)
                                if (position > 0) {
                                    tv_month.text =
                                        it.getItem(titlePositionList[position - 1]).data.text
                                    onceSetTitle = false
                                }
                            }
                            lastIsHead = false
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
            adapter = activity?.let {
                DailyFragmentAdapter(it)
            }
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
        titlePositionList.clear()
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