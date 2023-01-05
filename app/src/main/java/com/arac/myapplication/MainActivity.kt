package com.arac.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var editText1: EditText
    lateinit var sonuc1:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var clickme=findViewById<Button>(R.id.button2)
        editText = findViewById(R.id.editTextNumber2)
        editText1=findViewById(R.id.editTextNumber3)
        sonuc1=findViewById(R.id.sonuc)

        clickme.setOnClickListener{
    var sonuc=editText.text.toString().toInt()+editText1.text.toString().toInt()
            println(sonuc.toString()+"***")
           sonuc1.text=sonuc.toString().toInt().toString()
}
    }
}