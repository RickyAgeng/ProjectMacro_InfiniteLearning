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

        val Btn0 : ImageView = findViewById(R.id.btnback)
        Btn0.setOnClickListener(this)
        val Btn1 : CardView = findViewById(R.id.btn1)
        Btn1.setOnClickListener(this)
        val Btn2 : CardView = findViewById(R.id.btn2)
        Btn2.setOnClickListener(this)
        val Btn3 : CardView = findViewById(R.id.btn3)
        Btn3.setOnClickListener(this)
        val Btn4 : CardView = findViewById(R.id.btn4)
        Btn4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btnback -> {
                    val intent = Intent(this@Pengenalan, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn1 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Buah1::class.java)
                    startActivity(intent)
                }
                R.id.btn2 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Hewan1::class.java)
                    startActivity(intent)
                }
                R.id.btn3 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Warna1::class.java)
                    startActivity(intent)
                }
                R.id.btn4 -> {
                    val intent = Intent(this@Pengenalan, Pengenalan_Pancasila::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}