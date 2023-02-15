package com.longtv.android_tip_and_trick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.longtv.android_tip_and_trick.retrofit.GithubRepository

class MainActivity : AppCompatActivity() {
    private var mBtnRetrofit: Button? = null
    private var mRepository: GithubRepository? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRepository = GithubRepository(this)
        initView()
    }

    private fun initView() {
        mBtnRetrofit = findViewById(R.id.btn_retrofit)
        mBtnRetrofit?.setOnClickListener {
            mRepository?.getListRepos();
        }
    }
}