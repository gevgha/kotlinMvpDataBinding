package com.karen.kotlinmvpdatabindingexample.main

import com.karen.kotlinmvpdatabindingexample.base_mvp.BasePresenter

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {
    override var isAttached: Boolean
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
}