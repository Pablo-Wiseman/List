package com.example.list.domain

import androidx.lifecycle.LiveData

interface Repository {
    fun addItem(item: Item)
    fun deleteItem(item: Item)
    fun getItem(item: Int): Item
    fun getItemList(): LiveData<List<Item>>
}