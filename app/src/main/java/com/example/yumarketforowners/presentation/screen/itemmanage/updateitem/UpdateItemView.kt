package com.example.yumarketforowners.presentation.screen.itemmanage.updateitem

import com.example.yumarketforowners.presentation.screen.base.BaseView
import com.example.yumarketforowners.presentation.viewholder.itemmanage.OptionGroupUiState

interface UpdateItemView : BaseView {
    fun onRequestItemSuccess(item: UpdateItemUiState)
    fun navigateBack()
    fun showOptionGroups(optionGroups: List<OptionGroupUiState>)
}