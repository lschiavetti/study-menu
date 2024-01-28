package com.schiavetti.studymenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
    }

    private fun setupListeners() {
        findViewById<TextView>(R.id.createOptionsMenuTextView).setOnClickListener {
            startActivity(
                Intent(this, CreateOptionsMenuActivity::class.java)
            )
        }
        findViewById<TextView>(R.id.dynamicOptionsMenuTextView).setOnClickListener {
            startActivity(
                Intent(this, DynamicOptionsMenuActivity::class.java)
            )
        }
    }
}
