package com.business.botbanhang.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.business.botbanhang.R
import com.business.botbanhang.databinding.ActivityMainBinding
import com.business.botbanhang.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun layoutRes(): Int {
        return R.layout.activity_main
    }

    override fun viewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun initView() {

    }
}