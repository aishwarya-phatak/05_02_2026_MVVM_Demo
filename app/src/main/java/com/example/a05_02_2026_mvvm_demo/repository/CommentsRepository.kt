package com.example.a05_02_2026_mvvm_demo.repository

import com.example.a05_02_2026_mvvm_demo.models.Comment
import com.example.a05_02_2026_mvvm_demo.network.CommentApiService

class CommentsRepository(
    private val commentApiService: CommentApiService) {

    suspend fun fetchAllComments() : ArrayList<Comment>{
        return commentApiService.getApiResponse().comments
    }
}