package com.example.ultimeztask.ui.networking.models

data class Products(
	val productList: List<Product>,
	val status: Boolean
)

data class Product(
	val originalPrice: String,
	val productType: Int,
	val activeStatus: Boolean,
	val dateNTime: String,
	val V: Int,
	val description: String,
	val id: Int,
	val productName: String,
	val salePrice: String,
	val userRowId: Int
)

