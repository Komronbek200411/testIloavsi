package com.example.myapplication.view

import android.content.ClipData
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.ScienceModel
import kotlinx.android.synthetic.main.science_item_layout.view.*


interface ScienceAdabterCallBack{
    fun onClick(items: ScienceModel)
}

class ScienceAdapter(val  items: List<ScienceModel>, val callBack: ScienceAdabterCallBack): RecyclerView.Adapter<ScienceAdapter.ItemHolder>(){

    inner class ItemHolder (view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.science_item_layout, parent, false ))

    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items [position]
        holder.itemView.setOnClickListener{
          callBack.onClick(item)
        }

        holder.itemView.tvTitle.text = item.title
    }
}