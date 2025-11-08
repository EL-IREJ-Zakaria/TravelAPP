package com.example.travelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlightAdapter(private val flights: List<Flight>) :
    RecyclerView.Adapter<FlightAdapter.FlightViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flight_card, parent, false)
        return FlightViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlightViewHolder, position: Int) {
        val flight = flights[position]
        holder.airlineName.text = flight.airlineName
        holder.departureCode.text = flight.departureCode
        holder.departureTime.text = flight.departureTime
        holder.arrivalCode.text = flight.arrivalCode
        holder.arrivalTime.text = flight.arrivalTime
        holder.price.text = flight.price
        holder.airlineLogo.setImageResource(flight.airlineLogo)
    }

    override fun getItemCount() = flights.size

    class FlightViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val airlineLogo: ImageView = itemView.findViewById(R.id.airline_logo)
        val airlineName: TextView = itemView.findViewById(R.id.airline_name)
        val departureCode: TextView = itemView.findViewById(R.id.departure_code)
        val departureTime: TextView = itemView.findViewById(R.id.departure_time)
        val arrivalCode: TextView = itemView.findViewById(R.id.arrival_code)
        val arrivalTime: TextView = itemView.findViewById(R.id.arrival_time)
        val price: TextView = itemView.findViewById(R.id.price)
    }
}