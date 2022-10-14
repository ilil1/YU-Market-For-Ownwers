package com.example.yumarketforowners.presentation.screen.itemmanage

import com.example.yumarketforowners.R
import com.example.yumarketforowners.domain.model.item.OptionGroup
import com.example.yumarketforowners.domain.usecase.item.GetItems
import com.example.yumarketforowners.presentation.recyclerview.viewholder.CellType
import com.example.yumarketforowners.presentation.screen.base.BaseViewHolderState
import com.example.yumarketforowners.presentation.screen.base.Result
import com.example.yumarketforowners.presentation.mapper.item.toItemUiState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

class ItemManagePresenter @Inject constructor(
    private val view: ItemManageView,
    private val getItems: GetItems,
    private val scopeProvider: Provider<CoroutineScope>
) {
    private val coroutineScope get() = scopeProvider.get()

    fun requestData(marketId: Long, available: Boolean) {
        coroutineScope.launch {
            view.loading(isLoading = true)
            // TODO: 2022.05.27 get item by market id
            /* TODO: 2022-09-21 수 01:34, error 처리 구현 */

            val result = getItems(marketId = marketId, available = available)?.let {
                Result.Success(data = it.map { item -> item.toItemUiState() })
            } ?: Result.Error(R.string.error_placeholder)

            view.loading(isLoading = false)

            when (result) {
                is Result.Success -> view.onRequestDataSuccess(result.data)
                is Result.Error -> view.onRequestDataError(result.errorMessage)
            }
        }
    }
}

data class ItemUiState(
    override val id: Long,
    val name: String,
    val description: String,
    val stock: Int,
    val price: Int,
    val discountedPrice: Int,
    val discountRatio: Int,
    val imageUrl: String?,
    val optionGroups: List<OptionGroup>,
    val available: Boolean,
    var checkedForStateChange: Boolean = false,
) : BaseViewHolderState(id, CellType.ITEM_CELL)
