package com.example.daggerprac1

import dagger.Component

@Component
interface CarComponent {

    fun getWheels(): Wheels

    fun getCar(): Car
}