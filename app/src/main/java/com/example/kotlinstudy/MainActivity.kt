package com.example.kotlinstudy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showCarsButton = findViewById<Button>(R.id.button_show_cars)

        showCarsButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.text_result)
            textView.text = CarRepositoryImpl.showCarNames()
        }

        val carNameText = findViewById<EditText>(R.id.edit_car_name)
        val showDetailsButton = findViewById<Button>(R.id.button_show_details)
        val detailsTextView = findViewById<TextView>(R.id.text_details)

        showDetailsButton.setOnClickListener {
            val carName = carNameText.text.toString()
            detailsTextView.text = CarRepositoryImpl.showCarDetails(carName)
        }
    }
}


