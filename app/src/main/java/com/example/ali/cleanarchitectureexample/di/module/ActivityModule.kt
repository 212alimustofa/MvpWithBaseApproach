package com.example.ali.cleanarchitectureexample.di.module

import android.app.Activity
import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.example.ali.cleanarchitectureexample.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by ali on 19/10/17.
 */
@Module
class ActivityModule(val activity: Activity){
    @Provides
    @ActivityScope
    fun provideActivity() = activity

    @Provides
    @ActivityScope
    fun provideLayoutManager() = LinearLayoutManager(activity)
}