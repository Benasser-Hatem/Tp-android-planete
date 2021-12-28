package com.horizon.planetes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication1.R
import com.horizon.planetes.Planete
import com.horizon.planetes.R
import planetes.Planete
import java.util.*

class PlaneteAdapter(
    private var context : Context,
    private var listPlanet : ArrayList<Planete>
) : RecyclerView.Adapter<PlaneteAdapter.ViewHolder>(){



    override fun getItemCount(): Int {
        return listPlanet.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    inner class ViewHolder(view: View) :RecyclerView.ViewHolder(view),View.OnClickListener {


        private val namePlanet: TextView = view.findViewById(R.id.noms)
        private val distancePlanet: TextView = view.findViewById(R.id.distance)
        private val imagePlanet: ImageView = view.findViewById(R.id.image)

        init {
            view.setOnClickListener(this)
        }
        override fun onClick(view: View?) {
            Toast.makeText(context, "Nom Planet : " +listPlanet[adapterPosition].noms , Toast.LENGTH_SHORT).show()
        }

        fun bindViewHolder(planete : Planete){
            namePlanet.text=planete.noms
            distancePlanet.text=planete.distance.toString()
            imagePlanet.setImageResource(planete.idimages)
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViewHolder(listPlanet[position])
    }


}