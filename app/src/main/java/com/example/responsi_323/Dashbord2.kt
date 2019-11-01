package com.example.responsi_323

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_dashbord2.*

class Dashbord2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashbord2)

        var intent = intent
        val emailkamu=intent.getStringExtra("Emailkamu")
        val passkamu=intent.getStringExtra("Passkamu")
        val namakamu=intent.getStringExtra("Namakamu")
        val alamatkamu=intent.getStringExtra("Alamatkamu")

        val hasil=findViewById<TextView>(R.id.textView)
        intent= Intent()
        hasil.text ="Nama : "+namakamu+"\nAlamat : "+alamatkamu+"\nEmail : " + emailkamu + "\nPassword : " + passkamu


        button2.setOnClickListener(){
            intent= Intent(this,Register::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener(){
            intent= Intent(this, MainActivity::class.java)
            intent.putExtra("Emailkamu",emailkamu)
            intent.putExtra("Passkamu",passkamu)
            intent.putExtra("Namakamu",namakamu)
            intent.putExtra("Alamatkamu",alamatkamu)
            startActivity(intent)
        }
    }

}

