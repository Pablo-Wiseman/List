package com.example.list.domain

class GetItemUseCase(private val repository: Repository) {
    fun getItemUseCase(itemId: Int): Item{
        return repository.getItem(itemId)
    }
}