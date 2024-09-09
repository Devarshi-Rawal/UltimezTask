package com.example.ultimeztask.ui

import com.example.ultimeztask.ui.networking.RetrofitApiCall
import com.example.ultimeztask.ui.networking.models.Product

class ProductRepository {

    private val retrofitApiCall = RetrofitApiCall()

    suspend fun getProductList(): ArrayList<Product>{
        val productList = arrayListOf<Product>()

        val productListBody = retrofitApiCall.retrofitInstance().getProductList("Z9Q7WKEY7ORGBUFGN3EG1QS5Y7FG8DU29GHKKSZH").body()

        if (productListBody!= null){
            productList.addAll(productListBody.productList)
        }
        return productList
    }

    suspend fun addProduct(): String{
        var productAddedMessage = ""

        val productAddedBody = retrofitApiCall.retrofitInstance().addProduct("Z9Q7WKEY7ORGBUFGN3EG1QS5Y7FG8DU29GHKKSZH").body()
        val status = productAddedBody?.status

        if (status == true){
            productAddedMessage = "Product added successfully"
        }
        return productAddedMessage
    }
}