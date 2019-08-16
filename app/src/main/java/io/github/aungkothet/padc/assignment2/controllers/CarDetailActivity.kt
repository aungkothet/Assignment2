package io.github.aungkothet.padc.assignment2.controllers

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.github.aungkothet.padc.assignment2.R

class CarDetailActivity : AppCompatActivity() {

    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context, CarDetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_detail)
    }

    fun backPressed(view: View){
        finish()
    }
}
