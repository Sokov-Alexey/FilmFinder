package com.sokovalexey.filmapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val root = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item, root, false)
        root.addView(view)
    }
}
