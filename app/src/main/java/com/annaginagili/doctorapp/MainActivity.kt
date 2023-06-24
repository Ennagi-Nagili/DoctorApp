package com.annaginagili.doctorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.doctorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var recycler: RecyclerView
    lateinit var adapter: DoctorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        recycler = binding.recycler

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val imageList = mutableListOf(R.drawable.doctor1, R.drawable.doctor2, R.drawable.doctor3,
            R.drawable.doctor4) as ArrayList<Int>
        val nameList = mutableListOf("dr. Gilang Segara Bening", "dr. Shabil Chan", "dr. Mustakim",
        "dr. Suprihatini") as ArrayList<String>
        val specialList = mutableListOf("Heart", "Dental", "Eye", "Heart") as ArrayList<String>
        val hospitalList = mutableListOf("Persahabatan Hospital", "Columbia Asia Hospital",
        "Salemba Carolus Hospital", "Salemba Carolus Hospital") as ArrayList<String>
        val rateList = mutableListOf("(1221)", "(964)", "(762)", "(762)") as ArrayList<String>
        val openBackList = mutableListOf(R.drawable.open_back, R.drawable.open_back,
        R.drawable.close_back, R.drawable.open_back) as ArrayList<Int>
        val openList = mutableListOf("Open", "Open", "Close", "Open") as ArrayList<String>
        val openColorList = mutableListOf(ContextCompat.getColor(this, R.color.green),
            ContextCompat.getColor(this, R.color.green), ContextCompat.getColor(this, R.color.red),
            ContextCompat.getColor(this, R.color.green)) as ArrayList<Int>
        val bigList = mutableListOf(R.drawable.doctor1_big, R.drawable.big2, R.drawable.big3, R.drawable.big4) as ArrayList<Int>

        adapter = DoctorAdapter(this, imageList, nameList, specialList, hospitalList, rateList,
        openBackList, openList, openColorList, bigList)

        recycler.adapter = adapter
    }
}