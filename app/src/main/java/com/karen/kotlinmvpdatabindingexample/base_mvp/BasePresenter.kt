package com.karen.kotlinmvpdatabindingexample.base_mvp

abstract class BasePresenter<V : BaseContract.View> : BaseContract.Presenter<V> {
     open var isViewAttached: Boolean = false
     open fun onCreate() {
        isViewAttached = true
    }

     open fun onDestroy() {
        isViewAttached = false
    }
}