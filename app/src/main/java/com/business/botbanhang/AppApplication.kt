package com.business.botbanhang

import android.app.Application
import com.business.botbanhang.di.component.AppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class AppApplication : Application() {
    lateinit var instance : AppApplication

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    /*override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component: AppComponent = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
        return component
    }*/
}