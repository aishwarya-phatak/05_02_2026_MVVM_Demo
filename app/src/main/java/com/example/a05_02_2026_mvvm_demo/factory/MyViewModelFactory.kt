package com.example.a05_02_2026_mvvm_demo.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.a05_02_2026_mvvm_demo.repository.CommentsRepository
import com.example.a05_02_2026_mvvm_demo.viewmodels.CommentViewModel

class MyViewModelFactory(
    private val commentsRepository: CommentsRepository)
    : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CommentViewModel(commentsRepository) as T
    }
}