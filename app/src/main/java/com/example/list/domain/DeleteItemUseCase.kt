package com.example.list.domain

class DeleteItemUseCase(private val repository: Repository) {
    fun deleteItem(item: Item){
        repository.deleteItem(item)
    }
}