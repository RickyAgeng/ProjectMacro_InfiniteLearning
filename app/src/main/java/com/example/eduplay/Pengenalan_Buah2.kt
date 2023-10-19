package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Buah2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_buah2)

        val Back_alp : ImageView = findViewById(R.id.back_alp)
        Back_alp.setOnClickListener(this)
        val Home_alp : ImageView = findViewById(R.id.home_alp)
        Home_alp.setOnClickListener(this)
        val Prev_alp : ImageView = findViewById(R.id.prev_alp)
        Prev_alp.setOnClickListener(this)
        val Next_alp : ImageView = findViewById(R.id.next_alp)
        Next_alp.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_alp -> {
                    val intent = Intent(this@Pengenalan_Buah2, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_alp -> {
                    val intent = Intent(this@Pengenalan_Buah2, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.prev_alp -> {
                    val intent = Intent(this@Pengenalan_Buah2, Pengenalan_Buah1::class.java)
                    startActivity(intent)
                }
                R.id.next_alp -> {
                    val intent = Intent(this@Pengenalan_Buah2, Pengenalan_Buah3::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}