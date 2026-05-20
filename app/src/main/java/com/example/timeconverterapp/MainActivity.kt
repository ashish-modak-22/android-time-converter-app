package com.example.timeconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var enterSeconds: EditText
    private lateinit var convertButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterSeconds = findViewById(R.id.editText)
        convertButton = findViewById(R.id.button)
        resultText = findViewById(R.id.textView3)

        convertButton.setOnClickListener {
            if(enterSeconds.text.toString().isEmpty()){
                resultText.text = getString(R.string.textShow)
            }
            else{
                val givenSec = enterSeconds.text.toString().toInt()
                val days = (givenSec/86400)
                val hours = (givenSec%86400)/3600
                val mins = (givenSec%3600)/60
                val sec = (givenSec%60)

                resultText.text = "$days D  $hours H  $mins M  $sec S"
            }
        }
    }
}

