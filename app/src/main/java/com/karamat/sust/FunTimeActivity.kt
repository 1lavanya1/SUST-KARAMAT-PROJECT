package com.karamat.sust

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FunTimeActivity : AppCompatActivity() {

    private var likeCount1 = 0
    private var likeCount2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_time)


        val likeButton1: ImageButton = findViewById(R.id.likeButton1)
        val likeCountText1: TextView = findViewById(R.id.likeCount1)
        val likeButton2: ImageButton = findViewById(R.id.likeButton2)
        val likeCountText2: TextView = findViewById(R.id.likeCount2)


        likeButton1.setOnClickListener {
            likeCount1++
            likeCountText1.text = likeCount1.toString()
        }


        likeButton2.setOnClickListener {
            likeCount2++
            likeCountText2.text = likeCount2.toString()
        }
    }
}

