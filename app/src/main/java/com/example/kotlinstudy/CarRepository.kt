package com.example.kotlinstudy

interface CarRepository {

    fun requireCarList(): List<Car>

    fun addCar(car: Car)

    fun showCarNames(): String

    fun findCar(name: String): Car?

    fun showCarDetails(name: String): String
}