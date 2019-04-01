package com.omni.weather_appbootcampfinalproject

import android.app.Application
import com.omni.domain.Domain

class WeatherApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        Domain.integrateWith(this)
    }
}