package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Buah3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_buah3)

        val Back_pis : ImageView = findViewById(R.id.back_pis)
        Back_pis.setOnClickListener(this)
        val Home_pis : ImageView = findViewById(R.id.home_pis)
        Home_pis.setOnClickListener(this)
        val Prev_pis : ImageView = findViewById(R.id.prev_pis)
        Prev_pis.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_pis -> {
                    val intent = Intent(this@Pengenalan_Buah3, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_pis -> {
                    val intent = Intent(this@Pengenalan_Buah3, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_pis -> {
                    val intent = Intent(this@Pengenalan_Buah3, Pengenalan_Buah2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}