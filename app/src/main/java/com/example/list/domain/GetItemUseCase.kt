package com.example.list.domain

class GetItemUseCase(private val repository: Repository) {
    fun getItem(itemId: Int): Item{
        return repository.getItem(itemId)
    }
}