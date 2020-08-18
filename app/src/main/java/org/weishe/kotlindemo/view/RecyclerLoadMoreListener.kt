package org.weishe.kotlindemo.view

import androidx.recyclerview.widget.RecyclerView

/**
 * panyi crate on 2020.08.18 18:00
 * desc recyclerview滑动到底监听
 */
abstract class RecyclerLoadMoreListener : RecyclerView.OnScrollListener() {
    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange()) {
            loadMore()
        }
    }

    abstract fun loadMore()
}