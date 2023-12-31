package com.example.practice10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        setTitle("TableLayout")
    }

    fun Click(view: View){
        val btn = view as Button
        var text1 = findViewById<TextView>(R.id.textView2)
        var text2 = findViewById<TextView>(R.id.textView4)
        when (btn.id){
            R.id.button1 -> text1.text = "Вертикальная"
            R.id.button2 -> text2.text = "По левой границе"
            R.id.button3 -> text1.text = "Горизонтальная"
            R.id.button4 -> text2.text = "По центру"
            R.id.button5 -> text1.text = "Вертикальная"
            R.id.button6 -> text2.text = "По правой границе"
        }
    }
  
}