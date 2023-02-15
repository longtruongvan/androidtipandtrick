package com.longtv.android_tip_and_trick.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

public interface GithubApiService {
    @GET(".")
    fun listRepos(): Call<RepoResponse>
}