package com.business.botbanhang.di.component

import android.app.Application
import com.business.botbanhang.AppApplication
import com.business.botbanhang.di.module.ActivityBindingModule
import com.business.botbanhang.di.module.AppModule
import com.business.botbanhang.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class])
interface AppComponent : AndroidInjector<AppApplication> {
    override fun inject(application: AppApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}