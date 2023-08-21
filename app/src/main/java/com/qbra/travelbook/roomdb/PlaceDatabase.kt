package com.qbra.travelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.qbra.travelbook.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}