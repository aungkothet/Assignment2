package io.github.aungkothet.padc.assignment2.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.github.aungkothet.padc.assignment2.R
import io.github.aungkothet.padc.assignment2.adapter.RecyclerAdapter
import io.github.aungkothet.padc.assignment2.delegates.ItemClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :ItemClickListener, AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carItemRecyclerAdapter = RecyclerAdapter(applicationContext,this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = carItemRecyclerAdapter
    }

    override fun onClicked() {
        startActivity(CarDetailActivity.newIntent(this))
    }
}
