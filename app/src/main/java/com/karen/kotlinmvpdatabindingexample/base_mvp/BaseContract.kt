package com.karen.kotlinmvpdatabindingexample.base_mvp

interface BaseContract {
    interface View
    interface Presenter<V : View> {
        var isAttached: Boolean
    }

}