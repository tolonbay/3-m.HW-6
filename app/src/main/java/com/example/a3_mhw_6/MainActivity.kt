package com.example.a3_mhw_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_1,FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_2,SecondFragment()).commit()

    }
}