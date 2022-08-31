package com.example.guidancecouncelling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DrugActivity : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth
    private lateinit var databaseReference: DatabaseReference
    lateinit var showButton:Button
    lateinit var editText: EditText

    lateinit var TxtName:TextView
   lateinit var BtnSubmit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drug)

       auth=FirebaseAuth.getInstance()

        showButton=findViewById(R.id.showInput2)
        editText=findViewById(R.id.edit_text2)


        TxtName=findViewById(R.id.edit_text)
        BtnSubmit=findViewById(R.id.showInput)


        val showButton = findViewById<Button>(R.id.showInput2)
        val editText = findViewById<EditText>(R.id.edit_text2)


        showButton.setOnClickListener {
            val text=editText.text
            Toast.makeText(this,text, Toast.LENGTH_SHORT).show()
        }
        BtnSubmit.setOnClickListener {
            val user_info=TxtName.text.toString().trim()
            val id=System.currentTimeMillis().toString()

            if (user_info.isEmpty()){
                TxtName.setError("Please fill out this field if interested in guidance")
                TxtName.requestFocus()
            }else{
//                val userData= User(user_info)
                val userData=DrugActivity()
                val reference=FirebaseDatabase.getInstance().getReference().child("Users/$id")
                reference.setValue(userData).addOnCompleteListener{
                    if (it.isSuccessful){
                        val goToDash=
                            Intent(applicationContext,DrugActivity::class.java)
                        startActivity(goToDash)
                        Toast.makeText(applicationContext, "Submitted Successfully",Toast.LENGTH_LONG).show()
                        finish()

                    }else{
                        Toast.makeText(this,"Submitted Failed",Toast.LENGTH_LONG).show()
                        finish()
                    }
                }
            }
        }


    }


       }

