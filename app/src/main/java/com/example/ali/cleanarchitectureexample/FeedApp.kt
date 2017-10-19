package com.example.ali.cleanarchitectureexample

import android.app.Activity
import android.app.Application
import com.example.ali.cleanarchitectureexample.di.component.ActivityComponent
import com.example.ali.cleanarchitectureexample.di.component.AppComponent
import com.example.ali.cleanarchitectureexample.di.component.DaggerAppComponent
import com.example.ali.cleanarchitectureexample.di.module.ActivityModule
import com.example.ali.cleanarchitectureexample.di.module.ApiModule
import com.example.ali.cleanarchitectureexample.di.module.AppModule
import com.example.ali.cleanarchitectureexample.di.module.NetworkModule

/**
 * Created by ali on 02/10/17.
 */
class FeedApp: Application(){
    var appComponent: AppComponent? = null
    var activityComponent: ActivityComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    fun createActivityComponent(activity: Activity): ActivityComponent?{
        activityComponent = appComponent?.plus(ActivityModule(activity), NetworkModule(this), ApiModule())
        return activityComponent
    }

    fun releaseActivityComponent(){
        activityComponent = null
    }
}