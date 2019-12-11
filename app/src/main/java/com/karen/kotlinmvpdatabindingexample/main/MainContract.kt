package com.karen.kotlinmvpdatabindingexample.main

import com.karen.kotlinmvpdatabindingexample.base_mvp.BaseContract

interface MainContract {
    interface View : BaseContract.View{

    }
    interface Presenter:  BaseContract.Presenter<View> {

    }
}