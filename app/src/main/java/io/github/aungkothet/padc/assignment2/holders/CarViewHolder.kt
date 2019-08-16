package io.github.aungkothet.padc.assignment2.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.aungkothet.padc.assignment2.delegates.ItemClickListener

class CarViewHolder(itemView: View, private val itemClickListener: ItemClickListener):RecyclerView.ViewHolder(itemView){
    init {
        itemView.setOnClickListener { itemClickListener.onClicked() }
    }
}

