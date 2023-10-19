package com.example.eduplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Pengenalan_Buah1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengenalan_buah1)

        val Back_apl : ImageView = findViewById(R.id.back_apl)
        Back_apl.setOnClickListener(this)
        val Home_apl : ImageView = findViewById(R.id.home_apl)
        Home_apl.setOnClickListener(this)
        val Next_apl : ImageView = findViewById(R.id.next_apl)
        Next_apl.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.back_apl -> {
                    val intent = Intent(this@Pengenalan_Buah1, Pengenalan::class.java)
                    startActivity(intent)
                }
                R.id.home_apl -> {
                    val intent = Intent(this@Pengenalan_Buah1, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.next_apl -> {
                    val intent = Intent(this@Pengenalan_Buah1, Pengenalan_Buah2::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}