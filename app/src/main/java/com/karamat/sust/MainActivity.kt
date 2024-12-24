package com.karamat.sust

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {
            // Navigate to the FunTimeActivity
            val intent = Intent(this, FunTimeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    fun moveToFunTimeActivity(view: android.view.View) {
        val intent = Intent(this, FunTimeActivity::class.java)
        startActivity(intent)
        finish()
    }
}
