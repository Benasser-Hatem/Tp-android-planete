package com.horizon.planetes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication1.R
import planetes.Planete
import java.sql.DriverManager.println
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listOfPlanet : ArrayList<Planete> = ArrayList()
        var listView_planet:RecyclerView=findViewById(R.id.view)

        val res = resources
        val noms = res.getStringArray(R.array.noms)
        val distances = res.getIntArray(R.array.distances)
        val idImage = res.getIntArray(R.array.idimages)
        println("premier element: "+noms[0])

        for (i in noms.indices) {
            listOfPlanet.add(Planete(noms[i], distances[i],idImage[i]))
        }
        for (i in listOfPlanet.indices) {
            println("name: " +listOfPlanet[i].noms + " distance: " +listOfPlanet[i].distance+"image:" +listOfPlanet[i].idimages)
        }

        val adapter = PlaneteAdapter(this,listOfPlanet )
        listView_planet.setAdapter(adapter)
        listView_planet.layoutManager=LinearLayoutManager(this)
    }
}