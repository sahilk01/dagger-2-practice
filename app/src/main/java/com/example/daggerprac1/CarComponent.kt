package com.example.daggerprac1

import dagger.Component

@Component (modules = [WheelModule::class])
interface CarComponent {

    fun getWheels(): Wheels

    fun getCar(): Car

    fun mainInject(mainActivity: MainActivity)
}