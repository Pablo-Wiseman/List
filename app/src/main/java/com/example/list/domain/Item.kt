package com.example.list.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
data class Item(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val count: Int,
    val enable: Boolean,


)
