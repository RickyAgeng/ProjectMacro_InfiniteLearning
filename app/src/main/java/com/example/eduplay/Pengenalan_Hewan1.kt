package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Hewan1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_hewan1)

        val Back_aym : ImageView = findViewById(R.id.back_aym)
        Back_aym.setOnClickListener(this)
        val Home_aym : ImageView = findViewById(R.id.home_aym)
        Home_aym.setOnClickListener(this)
        val Next_aym : ImageView = findViewById(R.id.next_aym)
        Next_aym.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_aym -> {
                    val intent = Intent(this@Pengenalan_Hewan1, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_aym -> {
                    val intent = Intent(this@Pengenalan_Hewan1, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.next_aym -> {
                    val intent = Intent(this@Pengenalan_Hewan1, Pengenalan_Hewan2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}