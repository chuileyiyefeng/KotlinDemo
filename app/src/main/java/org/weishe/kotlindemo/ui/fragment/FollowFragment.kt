package org.weishe.kotlindemo.ui.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_attention.*
import org.weishe.kotlindemo.R
import org.weishe.kotlindemo.base.BaseFragment
import org.weishe.kotlindemo.bean.FollowItemBean
import org.weishe.kotlindemo.mvp.contract.FollowContract
import org.weishe.kotlindemo.mvp.present.FollowPresent
import org.weishe.kotlindemo.ui.adapter.FollowAdapter
import org.weishe.kotlindemo.view.RecyclerLoadMoreListener

/**
 * panyi crate on 2020.08.17 15:47
 * desc 发现里关注的fragment
 */
class FollowFragment : BaseFragment(), FollowContract.View {
    var followBean: FollowItemBean? = null
    private val present by lazy {
        FollowPresent()
    }
    private val adapter by lazy {
        activity?.let {
            FollowAdapter(it)
        }
    }

    override fun bindLayout(): Int {
        return R.layout.fragment_attention
    }

    override fun initView() {
    }

    override fun initData() {
        present.attachView(this)
        present.getFollowAuthor()
        lifecycle.addObserver(present)
        adapter?.let { followAdapter ->
            rv_follow.layoutManager = LinearLayoutManager(activity)
            rv_follow.adapter = followAdapter
            rv_follow.addOnScrollListener(object : RecyclerLoadMoreListener() {
                override fun loadMore() {
                    followBean?.let {
                        if (!it.nextPageUrl.isEmpty()) {
                            present.getNextPage(it.nextPageUrl)
                        }
                    }
                }

            })
        }
    }

    override fun setData(followBean: FollowItemBean) {
        this.followBean = followBean
        adapter?.addItemList(followBean.itemList)
    }

    override fun setMoreData(followBean: FollowItemBean) {
        this.followBean = followBean
        adapter?.addItemList(followBean.itemList)
    }

    override fun setErrorMsg(errorMsg: String) {

    }
}