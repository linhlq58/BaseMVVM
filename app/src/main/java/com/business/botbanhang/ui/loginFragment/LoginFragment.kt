package com.business.botbanhang.ui.loginFragment

import com.business.botbanhang.R
import com.business.botbanhang.databinding.FragmentLoginBinding
import com.business.botbanhang.ui.base.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun layoutRes(): Int {
        return R.layout.fragment_login
    }

    override fun viewModelClass(): Class<LoginViewModel> {
        return LoginViewModel::class.java
    }

    override fun initView() {

    }
}