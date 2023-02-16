package com.example.aplperhitunganpersegipanjang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ppAdapter (private val dataSet: MutableList<dataPP>) : RecyclerView.Adapter<ppAdapter.OprasiHolder>() {
    class OprasiHolder(view: View):RecyclerView.ViewHolder(view) {
        val hasilee = view.findViewById<TextView>(R.id.hasilee)
        val hapus = view.findViewById<ImageView>(R.id.hps)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OprasiHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.ppadapter,parent,false)
        return OprasiHolder(view)
    }

    override fun onBindViewHolder(holder: OprasiHolder, position: Int) {
        holder.hasilee.text = dataSet[position].hasilhitungan
        holder.hapus.setOnClickListener{
            dataSet.removeAt(position)
            notifyItemRangeRemoved(position,dataSet.size)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return  dataSet.size
    }

}
