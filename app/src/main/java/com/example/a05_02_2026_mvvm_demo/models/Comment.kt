package com.example.a05_02_2026_mvvm_demo.models

data class Comment(
    var id : Int,
    var body : String,
    var postId : Int,
    var likes : Int,
    var user : User
)
