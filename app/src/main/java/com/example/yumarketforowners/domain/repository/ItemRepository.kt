package com.example.yumarketforowners.domain.repository

import com.example.yumarketforowners.domain.model.item.Item
import kotlinx.coroutines.flow.Flow

interface ItemRepository {
    fun getItemsByMarketId(marketId: String): Flow<List<Item>>
    suspend fun getSingleItemById(itemId: Long): Item
    suspend fun updateItem(updatedItem: Item)
    suspend fun addItem(itemToAdd: Item)
}