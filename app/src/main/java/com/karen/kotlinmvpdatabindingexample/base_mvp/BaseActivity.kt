package com.karen.kotlinmvpdatabindingexample.base_mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<V : BaseContract.View, P : BaseContract.Presenter<V>> :
    AppCompatActivity(), BaseContract.View {
    lateinit var presenter: P
    abstract fun createPresenter(): P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.isAttached = true
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.isAttached = false
    }
}