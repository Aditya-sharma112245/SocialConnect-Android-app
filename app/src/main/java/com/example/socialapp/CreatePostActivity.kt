package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.socialapp.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postDao:PostDao
    lateinit var postInput: EditText
    lateinit var postButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        postInput = findViewById(R.id.postInput)
        postButton=findViewById(R.id.postButton)
        postDao=PostDao()
        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }

    }
}