package com.example.graph_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var lineView: LineView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lineView = findViewById(R.id.lineView)

        lineView.values = arrayOf(40,50,80,90,10)
    }
}