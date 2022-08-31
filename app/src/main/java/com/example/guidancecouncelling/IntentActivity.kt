package com.example.guidancecouncelling

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
  lateinit var Buttonsms:Button
  lateinit var Buttonemail:Button
  lateinit var Buttonshare:Button
  lateinit var Buttondial:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
     Buttonsms=findViewById(R.id.btn_sms2)
        Buttonemail=findViewById(R.id.btn_email2)
        Buttonshare=findViewById(R.id.btn_share2)
        Buttondial=findViewById(R.id.btn_dial2)

        Buttonsms!!.setOnClickListener {
            val uri=Uri.parse("smsto:0718471480")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body","I need Guidance and Councellling")
            startActivity(intent)
        }
        Buttonemail!!.setOnClickListener {
            val emaiIntent=
                Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","guidance@gmail.com","null"))
            emaiIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emaiIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emaiIntent,"Send email..."))
        }
        Buttonshare!!.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hey,download this app")
            startActivity(shareIntent)
        }
        Buttondial!!.setOnClickListener {
            val phone="25418471480"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,"null"))
        }
    }


}