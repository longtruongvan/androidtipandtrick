package com.longtv.android_tip_and_trick.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.longtv.android_tip_and_trick.R

/**
 * Documents: https://trello.com/c/pcIEH3BR/48-retrofit
 *
 * Step1: Tạo các giao diện (interfaces) xác định các hoạt động HTTP có thể có ()
 * Step2: Tạo lớp Retrofit.Builder – Phiên bản sử dụng giao diện và API Builder để cho phép xác định điểm cuối URL cho các hoạt động HTTP
 * Step3:
 * */
class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
    }
}