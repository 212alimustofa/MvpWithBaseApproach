package com.example.ali.cleanarchitectureexample.di.component

import com.example.ali.cleanarchitectureexample.di.module.ActivityModule
import com.example.ali.cleanarchitectureexample.di.module.ApiModule
import com.example.ali.cleanarchitectureexample.di.module.NetworkModule
import com.example.ali.cleanarchitectureexample.di.scope.ActivityScope
import com.example.ali.cleanarchitectureexample.ui.feed.feedimpl.FeedActivity
import dagger.Subcomponent

/**
 * Created by ali on 19/10/17.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class, NetworkModule::class, ApiModule::class))
interface ActivityComponent{
    fun inject(feedActivity: FeedActivity)
}