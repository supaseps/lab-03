package com.example.listycity3
import androidx.compose.runtime.mutableStateListOf


class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    fun addCity (city: City){   //city is given to the function and it is type City (object of class)
        _cities.add (city)
    }

    val cities: List<City>
        get() = _cities
}