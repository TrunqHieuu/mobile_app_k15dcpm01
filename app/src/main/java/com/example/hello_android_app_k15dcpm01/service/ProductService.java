package com.example.hello_android_app_k15dcpm01.service;

import com.example.hello_android_app_k15dcpm01.entities.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductService {
    @GET("/rest/products")
    Call<List<Product>> getAllProducts();


}
