package com.example.eduplay

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Pengenalan_Pancasila : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_pancasila)

        val btnNext1 : ImageView = findViewById(R.id.iv_next)
        btnNext1.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.iv_next -> {
                val intent = Intent(this@Pengenalan_Pancasila, Pengenalan_Pancasila2::class.java)
                startActivity(intent)
            }
        }
    }
}