package com.example.a05_02_2026_mvvm_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.R
import androidx.recyclerview.widget.RecyclerView
import com.example.a05_02_2026_mvvm_demo.R
import com.example.a05_02_2026_mvvm_demo.databinding.CommentViewBinding
import com.example.a05_02_2026_mvvm_demo.models.Comment

class CommentsAdapter(private val comments :
                      ArrayList<Comment>) :
    RecyclerView.Adapter<CommentsAdapter.CommentsViewHolder>(){

        lateinit var commentViewBinding: CommentViewBinding
      inner class CommentsViewHolder(itemView: View) :
          RecyclerView.ViewHolder(itemView) {
        init {
            commentViewBinding = CommentViewBinding.bind(itemView)
        }
      }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CommentsViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        val commentsView = layoutInflater.inflate(R.layout.comment_view,null)
        return CommentsViewHolder(commentsView)
    }

    override fun onBindViewHolder(p0: CommentsViewHolder, p1: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}