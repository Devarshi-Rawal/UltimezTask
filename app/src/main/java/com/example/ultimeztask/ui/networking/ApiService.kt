package com.example.ultimeztask.ui.networking

import com.example.ultimeztask.ui.networking.models.AddProductResponse
import com.example.ultimeztask.ui.networking.models.Products
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @GET("product/list")
    suspend fun getProductList(@Header("api_key") apiKey: String): Response<Products>

    @POST("product/add_new")
    suspend fun addProduct(@Header("api_key") apiKey: String): Response<AddProductResponse>
}