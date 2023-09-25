package com.example.criminalintent

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var dateButton: Button
    private lateinit var fAB: FloatingActionButton
    private lateinit var solvedCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        solvedCheckBox = findViewById(R.id.crime_solved)
        dateButton = findViewById(R.id.crime_date)
        fAB = findViewById(R.id.fab)

        dateButton.isEnabled = false
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH) + 1
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val hours = calendar.get(Calendar.HOUR_OF_DAY)
        val minutes = calendar.get(Calendar.MINUTE)
        dateButton.text = "$day.$month.$year $hours:$minutes"


        solvedCheckBox.setOnClickListener {
            if (solvedCheckBox.isChecked) {
                dateButton.isEnabled = true
            }
            else {
                dateButton.isEnabled = false
            }
        }

        dateButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }

        fAB.setOnClickListener {
            Toast.makeText(this@MainActivity, "Сообщений нет", Toast.LENGTH_LONG).show()
        }

    }
}