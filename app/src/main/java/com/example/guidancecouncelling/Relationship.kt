package com.example.guidancecouncelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Relationship : AppCompatActivity() {
    lateinit var showButton: Button
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relationship)

        showButton=findViewById(R.id.showInput1)
        editText=findViewById(R.id.edit_text1)


        val showButton = findViewById<Button>(R.id.showInput1)
        val editText = findViewById<EditText>(R.id.edit_text1)

        showButton.setOnClickListener {
            val text=editText.text
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }
    }
}