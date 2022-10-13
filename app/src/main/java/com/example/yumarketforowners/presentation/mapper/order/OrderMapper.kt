package com.example.yumarketforowners.presentation.mapper.order

import com.example.yumarketforowners.domain.model.order.Order
import com.example.yumarketforowners.domain.model.order.OrderItem
import com.example.yumarketforowners.presentation.screen.orderlist.OrderItemUiState
import com.example.yumarketforowners.presentation.screen.orderlist.OrderUiState

fun Order.toOrderUiState() = OrderUiState(
    id = id,
    orderId = id.toString(),
    orderedAt = orderedAt,
    orderItems = orderItems.toOrderItemUiStates(),
    totalPrice = totalPrice,
    orderState = orderState,
    deliveryFee = deliveryFee,
    deliveryTime = deliveryTime,
    deliveryType = deliveryType,
    telephoneNumber = orderMakerId.toString(),
    request = request
)

private fun List<OrderItem>.toOrderItemUiStates() = map {
    OrderItemUiState(
        id = it.id,
        name = it.name,
        imageUrl = it.imageUrl,
        amount = it.amount,
        pricePerItem = it.pricePerItem,
        orderOptionGroups = it.orderOptionGroups
    )
}