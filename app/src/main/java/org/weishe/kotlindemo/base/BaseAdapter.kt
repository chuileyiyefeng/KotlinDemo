package org.weishe.kotlindemo.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T>(val context: Context) :
    RecyclerView.Adapter<BaseViewHolder>(), View.OnClickListener {

    var list = ArrayList<T>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(LayoutInflater.from(context).inflate(bindLayout(), parent, false))
    }

    abstract fun bindLayout(): Int

    abstract fun bindHolder(holder: BaseViewHolder, position: Int)

    override fun getItemCount(): Int {
        return list.size
    }

    open fun addItem(t: T) {
        list.add(t)
        notifyItemInserted(list.size)
    }

    open fun clearAllItemNoRefresh() {
        list.clear()
        notifyDataSetChanged()
    }

    open fun addItemList(collections: Collection<T>) {
        list.addAll(collections)
        notifyDataSetChanged()
    }

    open fun getItem(position: Int): T {
        return list.get(position)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        bindHolder(holder, position)
        holder.itemView.setOnClickListener(this)
        holder.itemView.tag = position
    }

    override fun onClick(v: View?) {
        val i: Int = v?.getTag() as Int
        itemClickListener?.itemClick(i)
    }

    var itemClickListener: ItemClickListener? = null
        set(value) {
            field = value
        }

    interface ItemClickListener {
        fun itemClick(position: Int)
    }

}