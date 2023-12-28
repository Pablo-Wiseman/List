package com.example.list.domain

import androidx.lifecycle.LiveData

class GetItemListUseCase(private val repository: Repository) {
    fun getItemList(): LiveData<List<Item>>{
        return repository.getItemList()
    }
}