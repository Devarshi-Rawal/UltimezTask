package com.example.ultimeztask.ui.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitApiCall {

    private val BASEURL: String = "https://lobster-app-ddwng.ondigitalocean.app/"

    fun retrofitInstance(): ApiService{
        val retrofit = Retrofit
                        .Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(BASEURL)
                        .build()
        return retrofit.create(ApiService::class.java)
    }
}