package com.karen.kotlinmvpdatabindingexample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karen.kotlinmvpdatabindingexample.R
import com.karen.kotlinmvpdatabindingexample.base_mvp.BaseActivity

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun createPresenter(): MainContract.Presenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}
