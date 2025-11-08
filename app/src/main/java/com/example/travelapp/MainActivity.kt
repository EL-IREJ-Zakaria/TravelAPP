package com.example.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flightsRecyclerView: RecyclerView = findViewById(R.id.flights_recyclerview)
        flightsRecyclerView.layoutManager = LinearLayoutManager(this)

        val flights = listOf(
            Flight("Indigo", R.drawable.ic_indigo, "DEL", "06:30", "04h 15m", "BLR", "10:45", "7,319", true, "Use Code: Flyaway60 and get 60% instant cashback"),
            Flight("Vistara", R.drawable.ic_vistara, "DEL", "07:15", "02h 25m", "BLR", "09:40", "7,319", true, "Use Code: Flyaway60 and get 60% instant cashback"),
            Flight("Spicejet", R.drawable.ic_spicejet, "DEL", "07:55", "02h 10m", "BLR", "10:05", "7,319", true, "User GIUNIQUE and get Rs.250 instant discount"),
            Flight("Indigo", R.drawable.ic_indigo, "DEL", "08:45", "02h 25m", "BLR", "11:10", "7,319", true, "Use Code: Flyaway60 and get 60% instant cashback"),
            Flight("Emirates", R.drawable.ic_emirates, "DEL", "10:00", "02h 15m", "BLR", "12:15", "7,319", true, "User GIUNIQUE and get Rs.250 instant discount"),
            Flight("Indigo", R.drawable.ic_indigo, "DEL", "06:30", "04h 15m", "BLR", "10:45", "7,319", true, "Use Code: Flyaway60 and get 60% instant cashback"),
            Flight("Indigo", R.drawable.ic_indigo, "DEL", "06:30", "04h 15m", "BLR", "10:45", "7,319", true, "User GIUNIQUE and get Rs.250 instant discount")
        )

        val adapter = FlightAdapter(flights)
        flightsRecyclerView.adapter = adapter
    }
}
