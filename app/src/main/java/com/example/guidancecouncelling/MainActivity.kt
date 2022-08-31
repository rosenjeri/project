package com.example.guidancecouncelling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var TextIdea:TextView
    lateinit var Business:Button
    lateinit var DrugAddict:Button
    lateinit var Relationship:Button
    lateinit var Next:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextIdea=findViewById(R.id.txt_idea)
        Business=findViewById(R.id.btn_bsn)
        DrugAddict=findViewById(R.id.btn_drug)
        Relationship=findViewById(R.id.btn_rship)
        Next=findViewById(R.id.btn_next)


        TextIdea.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        Business.setOnClickListener {
            val intent=Intent(this,com.example.guidancecouncelling.Business::class.java)
            startActivity(intent)
        }
        DrugAddict.setOnClickListener {
            val intent=Intent(this,DrugActivity::class.java)
            startActivity(intent)
        }
        Relationship.setOnClickListener {
            val intent=Intent(this,com.example.guidancecouncelling.Relationship::class.java)
            startActivity(intent)
        }
        Next.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }



    }

}