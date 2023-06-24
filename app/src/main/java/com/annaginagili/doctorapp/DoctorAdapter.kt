package com.annaginagili.doctorapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.annaginagili.doctorapp.databinding.DoctorLayoutBinding

class DoctorAdapter(private val context: Context, private val imageList: ArrayList<Int>,
                    private val nameList: ArrayList<String>, private val specialList: ArrayList<String>,
                    private val hospitalList: ArrayList<String>, private val rateList: ArrayList<String>,
                    private val openBackList: ArrayList<Int>, private val openList: ArrayList<String>,
                    private val openColorList: ArrayList<Int>, private val bigList: ArrayList<Int>):
    RecyclerView.Adapter<DoctorAdapter.DoctorHolder>() {

    class DoctorHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = DoctorLayoutBinding.bind(itemView)
        private val imageView: ImageView = binding.image
        private val name: TextView = binding.name
        private val special: TextView = binding.special
        private val hospital: TextView = binding.hospital
        private val rate: TextView = binding.rate
        private val openBack: ImageView = binding.openBack
        private val open: TextView = binding.open

        fun setData(context: Context, image: Int, name: String, special: String, hospital: String,
                    rate: String, openBack: Int, open: String, openColor: Int, bigImage: Int) {
            imageView.setImageResource(image)
            this.name.text = name
            this.special.text = special
            this.hospital.text = hospital
            this.rate.text = rate
            this.openBack.setImageResource(openBack)
            this.open.text = open
            this.open.setTextColor(openColor)

            itemView.setOnClickListener {
                val intent = Intent(context, DoctorDetailsActivity::class.java)
                intent.putExtra("image", bigImage)
                intent.putExtra("name", name)
                intent.putExtra("special", special)
                intent.putExtra("hospital", hospital)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.doctor_layout, parent, false)
        return DoctorHolder(view)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: DoctorHolder, position: Int) {
        holder.setData(context, imageList[position], nameList[position], specialList[position],
            hospitalList[position], rateList[position], openBackList[position], openList[position],
            openColorList[position], bigList[position])
    }
}