package com.quansu.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.quansu.myapplication.R

class MainActivity : AppCompatActivity() {
    private val logTag: String = "ActivityLifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(logTag, "onCreate invoked")
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_jump_view_draw).setOnClickListener {
            startActivity(Intent(this, ViewDrawActivity::class.java))
        }
        findViewById<Button>(R.id.btn_jump_view_draw3).setOnClickListener {
            startActivity(Intent(this, ViewDrawActivity::class.java).apply {
                putExtra("from", 2)
            })
        }
        findViewById<Button>(R.id.btn_jump_view_draw2).setOnClickListener {
            startActivity(Intent(this, ViewDrawActivity::class.java).apply {
                putExtra("from", 1)
            })
        }
    }

}
