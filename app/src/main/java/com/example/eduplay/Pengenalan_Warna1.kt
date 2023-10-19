package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Warna1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_warna1)

        val Back_biru : ImageView = findViewById(R.id.back_biru)
        Back_biru.setOnClickListener(this)
        val Home_biru : ImageView = findViewById(R.id.home_biru)
        Home_biru.setOnClickListener(this)
        val Next_biru : ImageView = findViewById(R.id.next_biru)
        Next_biru.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_biru -> {
                    val intent = Intent(this@Pengenalan_Warna1, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_biru -> {
                    val intent = Intent(this@Pengenalan_Warna1, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.next_biru -> {
                    val intent = Intent(this@Pengenalan_Warna1, Pengenalan_Warna2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}