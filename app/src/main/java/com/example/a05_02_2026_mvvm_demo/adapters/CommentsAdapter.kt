package com.example.a05_02_2026_mvvm_demo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        val commentsView = layoutInflater.inflate(R.layout.comment_view,null)
        return CommentsViewHolder(commentsView)
    }

    override fun onBindViewHolder(commentsViewHolder : CommentsViewHolder, position: Int) {

        commentViewBinding.commentId.text = "${comments[position].id}"

//        commentsViewHolder.itemView.findViewById<TextView>(R.id.commentId).text =
//            "${comments[position].id}"
    }

    override fun getItemCount(): Int {
        return comments.size
    }
}