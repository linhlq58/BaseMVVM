package com.business.botbanhang.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<T: ViewDataBinding, M: BaseViewModel> : AppCompatActivity() {
    protected lateinit var binding: T
    protected lateinit var viewModel: M

    /*@Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory*/

    @LayoutRes
    protected abstract fun layoutRes(): Int

    protected abstract fun viewModelClass(): Class<M>

    //protected abstract fun handleViewState()

    protected abstract fun initView()

    //abstract fun showLoading()

    //abstract fun hideLoading()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes());
        binding.lifecycleOwner = this
        viewModel = ViewModelProvider(this).get(viewModelClass())
        initView()
    }
}