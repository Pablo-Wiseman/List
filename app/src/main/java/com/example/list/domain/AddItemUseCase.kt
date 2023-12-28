package com.example.list.domain

class AddItemUseCase(private val repository: Repository) {
    fun addItem(item: Item){
        repository.addItem(item)
    }
}