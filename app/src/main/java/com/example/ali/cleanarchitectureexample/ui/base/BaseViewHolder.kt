package com.example.ali.cleanarchitectureexample.ui.base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by ali on 06/10/17.
 */
abstract class BaseViewHolder<D>(view: View): RecyclerView.ViewHolder(view){
    abstract fun onBind(data: D)
}