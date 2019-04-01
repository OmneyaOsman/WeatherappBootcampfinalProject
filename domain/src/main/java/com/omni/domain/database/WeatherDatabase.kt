package com.omni.domain.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.omni.domain.applicationLiveData
import com.omni.domain.getApplication
import com.omni.entities.City
import com.omni.entities.FavoriteCityId


val weatherDatabase :WeatherDatabase by lazy {
    initializeDatabase(applicationLiveData.getApplication())
}

@Database(entities = [City::class , FavoriteCityId::class] ,version = 1 , exportSchema = false)
@TypeConverters(CoordinatesTypeConverter::class)
abstract class WeatherDatabase :RoomDatabase() {
    abstract val citiesDao :CitiesDao
    abstract val favoritesDao :FavoritesDao
}
