package com.example.ali.cleanarchitectureexample.ui.feed.adapter

import android.view.ViewGroup
import com.example.ali.cleanarchitectureexample.R
import com.example.ali.cleanarchitectureexample.model.Feed
import com.example.ali.cleanarchitectureexample.ui.base.BaseAdapter

/**
 * Created by ali on 02/10/17.
 */
class FeedAdapter: BaseAdapter<Feed, FeedViewHolder> (){

    override fun getItemResourceLayout(viewType: Int) = R.layout.feed_card

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
            FeedViewHolder(getView(parent, viewType))


}