package com.example.yumarketforowners.domain.usecase.item

import com.example.yumarketforowners.domain.model.item.Item
import com.example.yumarketforowners.domain.repository.ItemRepository
import com.example.yumarketforowners.domain.validator.ItemValidator

class UpdateItemUseCase(
    private val repository: ItemRepository
) {
    suspend operator fun invoke(updatedItem: Item) {
        ItemValidator.validateItem(item = updatedItem)
        repository.updateItem(updatedItem = updatedItem)
    }
}
