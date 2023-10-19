package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Hewan3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_hewan3)

        val Back_sng : ImageView = findViewById(R.id.back_sng)
        Back_sng.setOnClickListener(this)
        val Home_sng : ImageView = findViewById(R.id.home_sng)
        Home_sng.setOnClickListener(this)
        val Prev_sng : ImageView = findViewById(R.id.prev_sng)
        Prev_sng.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_sng -> {
                    val intent = Intent(this@Pengenalan_Hewan3, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_sng -> {
                    val intent = Intent(this@Pengenalan_Hewan3, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_sng -> {
                    val intent = Intent(this@Pengenalan_Hewan3, Pengenalan_Hewan2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}