package com.example.ali.cleanarchitectureexample.ui.feed.adapter

import android.view.View
import com.example.ali.cleanarchitectureexample.model.Feed
import com.example.ali.cleanarchitectureexample.ui.base.BaseViewHolder
import kotlinx.android.synthetic.main.feed_card.view.*

/**
 * Created by ali on 06/10/17.
 */
class FeedViewHolder(view: View): BaseViewHolder<Feed>(view){
    override fun onBind(data: Feed) {
        title.text = data.title
        body.text = data.body
    }

    val title = view.tvTtitle
    val body = view.tvBody
}