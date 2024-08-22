package com.example.unitconventor

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edt : EditText = findViewById(R.id.valueEt)
        val btn : Button = findViewById(R.id.convBtn)
        val result : TextView = findViewById(R.id.resultText)

        btn.setOnClickListener(){
            val inch : Int = edt.text.toString().toInt()
            result.setText("" + convert(inch))
        }

    }

    private fun convert(inch: Int): Double {
        var CM = inch * 2.54
        return CM
    }
}