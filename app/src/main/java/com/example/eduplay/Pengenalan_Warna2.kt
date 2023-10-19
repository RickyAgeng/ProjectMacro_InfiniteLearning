package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Warna2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_warna2)

        val Back_kun : ImageView = findViewById(R.id.back_kun)
        Back_kun.setOnClickListener(this)
        val Home_kun : ImageView = findViewById(R.id.home_kun)
        Home_kun.setOnClickListener(this)
        val Prev_kun : ImageView = findViewById(R.id.prev_kun)
        Prev_kun.setOnClickListener(this)
        val Next_kun : ImageView = findViewById(R.id.next_kun)
        Next_kun.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_kun -> {
                    val intent = Intent(this@Pengenalan_Warna2, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_kun -> {
                    val intent = Intent(this@Pengenalan_Warna2, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_kun -> {
                    val intent = Intent(this@Pengenalan_Warna2, Pengenalan_Warna3::class.java)
                    startActivity(intent)
                }
                R.id.next_kun -> {
                    val intent = Intent(this@Pengenalan_Warna2, Pengenalan_Warna1::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}