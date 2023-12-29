package com.example.list.data

import androidx.lifecycle.LiveData
import com.example.list.domain.Item
import com.example.list.domain.Repository

class RepositoryImpl(private val dao: ItemDao): Repository {

    private lateinit var items: List<Item>

    override fun addItem(item: Item) {

    }

    override fun editItem(item: Item) {
        TODO("Not yet implemented")
    }

    override fun deleteItem(item: Item) {
        TODO("Not yet implemented")
    }

    override fun getItem(item: Int): Item {
        TODO("Not yet implemented")
    }

    override fun getItemList(): LiveData<List<Item>> {
        return dao.getItemList()
    }
}