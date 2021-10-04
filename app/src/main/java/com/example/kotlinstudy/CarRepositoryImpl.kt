package com.example.kotlinstudy

import java.lang.StringBuilder

object CarRepositoryImpl : CarRepository {

    private var carList = arrayListOf(
        Car("BMW X5", "black", 20000),
        Car("Kia Rio", "blue", 5000),
        Car("Nissan Patrol", "white", 15000),
        Car("Volvo C60", "Silver", 12000),
        Car("Honda Civic", "red", 8000)
    )


    override fun requireCarList(): ArrayList<Car> = carList

    override fun addCar(car: Car) {
        carList.add(car)
    }

    override fun showCarNames(): String {
        val carNames = StringBuilder()
        for (car in carList) {
            carNames.append(car.name).append("\n")
        }
        return carNames.toString()
    }

    override fun findCar(name: String): Car? {
        for(car in carList) {
            if (car.name == name) return car.copy()
        }
        return null
    }

    override fun showCarDetails(name: String): String {
        return when (val car = findCar(name)) {
            null -> "The car not found!"
            else -> car.name + "\nColor: " + car.color + "\nPrice: " + car.price
        }
    }
}