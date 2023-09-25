package com.example.criminalintent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View


class MainActivity2 : AppCompatActivity() {
    private lateinit var fAB: FloatingActionButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val parentLayout = findViewById<View>(android.R.id.content)
        Snackbar.make(parentLayout,"Вы на следующем активити", Snackbar.LENGTH_LONG).show()

        fAB = findViewById(R.id.fab2)
        fAB.setOnClickListener {
            startActivity(Intent(this@MainActivity2, MainActivity::class.java))
        }
    }
}