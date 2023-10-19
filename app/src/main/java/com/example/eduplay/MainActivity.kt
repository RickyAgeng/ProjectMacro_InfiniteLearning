package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val membaca: ImageView = findViewById(R.id.membaca)
        membaca.setOnClickListener(this)
        val mewarnai: ImageView = findViewById(R.id.mewarnai)
        mewarnai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.membaca -> {
                    val intent = Intent(this@MainActivity, Membaca1::class.java)
                    startActivity(intent)
                }
                R.id.mewarnai -> {
                    val intent = Intent(this@MainActivity, Mewarnai1::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}