package com.example.ultimeztask.ui.networking.models

data class AddProductResponse(
	val message: AddedProduct,
	val status: Boolean
)

data class AddedProduct(
	val originalPrice: String,
	val productType: Int,
	val activeStatus: Boolean,
	val dateNTime: String,
	val V: Int,
	val description: String,
	val id: Int,
	val productName: String,
	val salePrice: String
)

