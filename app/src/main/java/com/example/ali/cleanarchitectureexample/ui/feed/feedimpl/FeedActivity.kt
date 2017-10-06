package com.example.ali.cleanarchitectureexample.ui.feed.feedimpl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.example.ali.cleanarchitectureexample.FeedApp
import com.example.ali.cleanarchitectureexample.R
import com.example.ali.cleanarchitectureexample.model.Feed
import com.example.ali.cleanarchitectureexample.ui.base.BaseAdapter
import com.example.ali.cleanarchitectureexample.ui.base.BaseViewHolder
import com.example.ali.cleanarchitectureexample.ui.feed.feedcontract.FeedContract
import kotlinx.android.synthetic.main.activity_feed.*
import kotlinx.android.synthetic.main.feed_card.view.*
import javax.inject.Inject

class FeedActivity : AppCompatActivity(), FeedContract.View {
    @Inject
    lateinit var presenter: FeedPresenter

    var adapter = object : BaseAdapter<Feed, BaseViewHolder<Feed>>() {
        override fun getItemResourceLayout(viewType: Int) = R.layout.feed_card

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
                getViewHolder(getView(parent, viewType))
    }

    fun getViewHolder(view: View):BaseViewHolder<Feed>{
        return object : BaseViewHolder<Feed>(view){
            override fun onBind(data: Feed) {
                view.tvTtitle.text = data.title
                view.tvBody.text = data.body
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        (application as FeedApp).appComponent?.inject(this)
        setupRecyclerView()
        presenter.onAttach(this)
        presenter.getFeedData()
    }

    private fun setupRecyclerView() {
        rvFeed.setHasFixedSize(true)
        rvFeed.layoutManager = LinearLayoutManager(this)
        rvFeed.adapter = adapter
    }

    override fun showErrorLog(message: String?) {
        Log.d("error load data", message)
    }

    override fun onSuccessGetFeedData(data: List<Feed>?) {
        adapter.setData(data)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }
}
