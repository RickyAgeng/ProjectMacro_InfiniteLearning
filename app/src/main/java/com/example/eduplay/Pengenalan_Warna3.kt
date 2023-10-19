package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Warna3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_warna3)

        val Back_mrh : ImageView = findViewById(R.id.back_mrh)
        Back_mrh.setOnClickListener(this)
        val Home_mrh : ImageView = findViewById(R.id.home_mrh)
        Home_mrh.setOnClickListener(this)
        val Prev_mrh : ImageView = findViewById(R.id.prev_mrh)
        Prev_mrh.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_mrh -> {
                    val intent = Intent(this@Pengenalan_Warna3, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_mrh -> {
                    val intent = Intent(this@Pengenalan_Warna3, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_mrh -> {
                    val intent = Intent(this@Pengenalan_Warna3, Pengenalan_Warna2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}