package com.longtv.android_tip_and_trick.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        fun getClient(): GithubApiService {
            val retrofit: Retrofit = Retrofit.Builder()
                                    .baseUrl("https://api.github.com/")
                                    .addConverterFactory(GsonConverterFactory.create()).build()

            return retrofit.create(GithubApiService::class.java);
        }
    }
}