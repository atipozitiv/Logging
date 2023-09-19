package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber
import timber.log.Timber.Forest.plant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText: EditText = findViewById(R.id.EditText);
        var logButton: Button = findViewById(R.id.button_log);
        var timberButton: Button = findViewById(R.id.button_timber);
        logButton.setOnClickListener {
            Log.i("From EditText", editText.getText().toString())
        }
        plant(Timber.DebugTree())
        timberButton.setOnClickListener {
            Timber.v(editText.getText().toString())
        }
    }
}