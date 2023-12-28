package com.example.list.domain

class EditItemUseCase(private val repository: Repository) {

    fun editItem(item: Item) {
        repository.editItem(item)
    }
}