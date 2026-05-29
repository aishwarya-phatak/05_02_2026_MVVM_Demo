package com.example.a05_02_2026_mvvm_demo.models

data class ApiResponse(
    var comments : ArrayList<Comment>,
    var total : Int,
    var skip : Int,
    var limit : Int
)
