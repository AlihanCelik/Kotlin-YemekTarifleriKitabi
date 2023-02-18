package com.example.yemektariflerikitabi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class ListeRecyclerAdapter(val yemekLsitesi:ArrayList<String>,val IdListesi:ArrayList<Int>) :RecyclerView.Adapter<ListeRecyclerAdapter.YemekHolder>() {
    class YemekHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekHolder {
        val inflater=LayoutInflater.from((parent.context))
        val view= inflater.inflate(R.layout.recycler_row,parent,false)
        return YemekHolder(view)
    }

    override fun getItemCount(): Int {
        return yemekLsitesi.size
    }

    override fun onBindViewHolder(holder: YemekHolder, position: Int) {
        holder.itemView.recycler_row_text.text=yemekLsitesi[position]
        holder.itemView.setOnClickListener{
            val action=ListeFragmentDirections.actionListeFragmentToTarifFragment("recyclerdangeldim",IdListesi[position])
            Navigation.findNavController(it).navigate(action)
        }
    }

}