package com.example.eduplay


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Pengenalan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan)

        val btnBtn1 : ImageView = findViewById(R.id.btn1)
        btnBtn1.setOnClickListener(this)
        val btnBtn2 : ImageView = findViewById(R.id.btn2)
        btnBtn2.setOnClickListener(this)
        val btnBtn3 : ImageView = findViewById(R.id.btn3)
        btnBtn3.setOnClickListener(this)
        val btnBtn4 : ImageView = findViewById(R.id.btn4)
        btnBtn4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v?.id) {
                R.id.btn1 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Buah1::class.java)
                    startActivity(intent)
                }
                R.id.btn1 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Hewan1::class.java)
                    startActivity(intent)
                }
                R.id.btn1 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Warna1::class.java)
                    startActivity(intent)
                }
                R.id.btn1 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Pancasila::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}