package com.longtv.android_tip_and_trick.retrofit

import android.content.Context
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GithubRepository(private var context: Context) : Callback<RepoResponse> {

    fun getListRepos() {
        val response: Call<RepoResponse> = RetrofitClient.getClient().listRepos()
        response.enqueue(this)
    }

    override fun onResponse(
        call: Call<RepoResponse>,
        response: Response<RepoResponse>
    ) {
        if (response.isSuccessful) {
            // TODO: update ui
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
        }
    }

    override fun onFailure(call: Call<RepoResponse>, t: Throwable) {
        // TODO: show error
        Log.d("GithubRepository", "")
        Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show();
    }
}