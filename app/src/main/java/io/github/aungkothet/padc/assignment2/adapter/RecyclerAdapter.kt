package io.github.aungkothet.padc.assignment2.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.aungkothet.padc.assignment2.R
import io.github.aungkothet.padc.assignment2.delegates.ItemClickListener
import io.github.aungkothet.padc.assignment2.holders.CarViewHolder

class RecyclerAdapter(private val context: Context, private val itemClick: ItemClickListener)
    : RecyclerView.Adapter<CarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CarViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.car_item, parent, false)
        return CarViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(viewHolder: CarViewHolder, position: Int) {

    }

}