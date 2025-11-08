package com.example.travelapp

data class Flight(
    val airlineName: String,
    val airlineLogoResId: Int,
    val departureCode: String,
    val departureTime: String,
    val flightDuration: String,
    val arrivalCode: String,
    val arrivalTime: String,
    val price: String,
    val freeMeal: Boolean,
    val discountCode: String
)
