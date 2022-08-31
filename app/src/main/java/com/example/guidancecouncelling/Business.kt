package com.example.guidancecouncelling

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Business : AppCompatActivity(){
    lateinit var showButton:Button
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.businesschallenges)
        showButton=findViewById(R.id.showInput)
        editText=findViewById(R.id.edit_text)

        val showButton = findViewById<Button>(R.id.showInput)
        val editText = findViewById<EditText>(R.id.edit_text)

        showButton.setOnClickListener {
            val text=editText.text
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }
    }
}