package com.example.yumarketforowners.presentation.screen.orderlist

import com.example.yumarketforowners.presentation.screen.base.BaseView

interface OrderListView : BaseView {
    fun onRequestDataSuccess(data: List<OrderUiState>)
    fun navigateToCallScreen(telephoneNumber: String)
}