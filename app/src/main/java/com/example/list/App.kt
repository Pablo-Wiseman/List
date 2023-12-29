package com.example.list

import android.app.Application
import androidx.room.Room
import com.example.list.data.ItemDatabase

class App : Application() {
    
    lateinit var db: ItemDatabase
    
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            this,
            ItemDatabase::class.java,
            "item_database"
        ).build()
    }
}