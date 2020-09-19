package com.example.daggerprac1

import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}