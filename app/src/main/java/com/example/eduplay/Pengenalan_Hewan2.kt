package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Hewan2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_hewan2)

        val Back_ajg : ImageView = findViewById(R.id.back_ajg)
        Back_ajg.setOnClickListener(this)
        val Home_ajg : ImageView = findViewById(R.id.home_ajg)
        Home_ajg.setOnClickListener(this)
        val Prev_ajg : ImageView = findViewById(R.id.prev_ajg)
        Prev_ajg.setOnClickListener(this)
        val Next_ajg : ImageView = findViewById(R.id.next_ajg)
        Next_ajg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_ajg -> {
                    val intent = Intent(this@Pengenalan_Hewan2, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_ajg -> {
                    val intent = Intent(this@Pengenalan_Hewan2, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_ajg -> {
                    val intent = Intent(this@Pengenalan_Hewan2, Pengenalan_Hewan1::class.java)
                    startActivity(intent)
                }
                R.id.next_ajg -> {
                    val intent = Intent(this@Pengenalan_Hewan2, Pengenalan_Buah3::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}