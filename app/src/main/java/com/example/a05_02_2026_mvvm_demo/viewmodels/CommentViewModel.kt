package com.example.a05_02_2026_mvvm_demo.viewmodels

import androidx.lifecycle.MutableLiveData
import com.example.a05_02_2026_mvvm_demo.models.Comment
import com.example.a05_02_2026_mvvm_demo.repository.CommentsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CommentViewModel(private val commentsRepository: CommentsRepository){

    val commentsMutableLiveData = MutableLiveData<Boolean>()
    val comments = ArrayList<Comment>()

    fun fetchComments(){
        CoroutineScope(Dispatchers.IO).launch {
            val comments = commentsRepository.fetchAllComments()
            withContext(Dispatchers.Main){
                this@CommentViewModel.comments.addAll(comments)
                commentsMutableLiveData.postValue(true)
            }
        }
    }
}