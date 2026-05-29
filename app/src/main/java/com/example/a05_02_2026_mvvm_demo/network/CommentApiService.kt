package com.example.a05_02_2026_mvvm_demo.network

import com.example.a05_02_2026_mvvm_demo.models.ApiResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CommentApiService {

    @GET("comments")
    suspend fun getApiResponse() : ApiResponse

    companion object{
        var commentApiService : CommentApiService? = null
        fun getInstance() : CommentApiService{
            var retrofit = Retrofit.Builder()
                .baseUrl("https://dummyjson.com/comments")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            commentApiService = retrofit.create<CommentApiService>(CommentApiService::class.java)
            return commentApiService!!
        }
    }
}