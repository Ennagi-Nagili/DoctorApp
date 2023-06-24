package com.annaginagili.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DoctorDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)
        val name = findViewById<TextView>(R.id.name)
        val image = findViewById<ImageView>(R.id.image)
        val special = findViewById<TextView>(R.id.special)
        val hospital = findViewById<TextView>(R.id.hospital)

        name.text = intent.getStringExtra("name")
        special.text = intent.getStringExtra("name")
        hospital.text = intent.getStringExtra("hospital")
        image.setImageResource(intent.getIntExtra("image", R.drawable.doctor1))
    }
}