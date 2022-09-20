package com.example.yumarketforowners.presentation.screen.itemmanage

import androidx.lifecycle.LifecycleCoroutineScope
import com.example.yumarketforowners.domain.model.itemmanage.Item
import com.example.yumarketforowners.domain.repository.ItemRepository
import com.example.yumarketforowners.presentation.screen.base.State
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

class ItemManagePresenter @Inject constructor(
    private val view: ItemListInnerFragment,
    private val itemRepository: ItemRepository,
    private val scopeProvider: Provider<LifecycleCoroutineScope>
) {
    private val coroutineScope get() = scopeProvider.get()

    fun requestData(marketId: Long) {
        coroutineScope.launch {
            view.loading(show = true)
            // TODO: 2022.05.27 get item by market id
            /* TODO: 2022-09-21 수 01:34, error 처리 구현 */
            val result: State = State.Success(
                data = itemRepository.getItemsByMarketId(marketId)
            )
            view.loading(show = false)

            @Suppress("UNCHECKED_CAST")
            when (result) {
                is State.Success<*> -> view.onRequestDataSuccess(result.data as List<Item>)
                is State.Error -> view.onRequestDataError(result.errorMessage)
            }
        }
    }
}