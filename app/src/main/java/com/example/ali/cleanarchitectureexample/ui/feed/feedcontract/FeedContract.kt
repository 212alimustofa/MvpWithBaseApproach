package com.example.ali.cleanarchitectureexample.ui.feed.feedcontract

import android.view.View
import com.example.ali.cleanarchitectureexample.model.Feed
import com.example.ali.cleanarchitectureexample.ui.base.BasePresenter
import com.example.ali.cleanarchitectureexample.ui.base.BaseView
import io.reactivex.Observable

/**
 * Created by ali on 02/10/17.
 */
class FeedContract{
    interface View: BaseView{
        fun showErrorLog(message: String?)
        fun onSuccessGetFeedData(data: List<Feed>?)
    }

    interface Presenter: BasePresenter<View>{
        fun getFeedData()
    }

    interface Interactor{
        fun getFeedData(): Observable<List<Feed>>
    }
}