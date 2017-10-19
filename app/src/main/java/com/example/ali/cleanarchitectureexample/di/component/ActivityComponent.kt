package com.example.ali.cleanarchitectureexample.di.component

import android.content.Context
import com.example.ali.cleanarchitectureexample.di.module.ActivityModule
import com.example.ali.cleanarchitectureexample.di.scope.ActivityScope
import com.example.ali.cleanarchitectureexample.ui.feed.feedimpl.FeedActivity
import dagger.Subcomponent

/**
 * Created by ali on 19/10/17.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent{
    fun inject(feedActivity: FeedActivity)
}