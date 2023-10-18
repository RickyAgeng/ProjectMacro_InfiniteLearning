package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Membaca2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membaca2)

        val nextNav: ImageView = findViewById(R.id.nextNav)
        nextNav.setOnClickListener(this)
        val beforeNav: ImageView = findViewById(R.id.beforeNav)
        beforeNav.setOnClickListener(this)
        val backView: ImageView  = findViewById(R.id.backView)
        backView.setOnClickListener(this)
        val home: ImageView = findViewById(R.id.home)
        home.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.nextNav -> {
                    val intent = Intent(this@Membaca2, Membaca3::class.java)
                    startActivity(intent)
                }
                R.id.beforeNav -> {
                    val intent = Intent(this@Membaca2,Membaca1::class.java)
                    startActivity(intent)
                }
                R.id.backView -> {
                    val intent = Intent(this@Membaca2, Membaca1::class.java)
                    startActivity(intent)
                }
                R.id.home -> {
                    val intent = Intent(this@Membaca2, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
