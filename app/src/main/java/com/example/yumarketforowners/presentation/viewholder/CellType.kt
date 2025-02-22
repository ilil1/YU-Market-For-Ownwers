package com.example.yumarketforowners.presentation.viewholder

import androidx.annotation.LayoutRes
import com.example.yumarketforowners.R
import com.example.yumarketforowners.presentation.viewholder.chat.MyChatViewHolder
import com.example.yumarketforowners.presentation.viewholder.chat.OpponentChatViewHolder
import com.example.yumarketforowners.presentation.viewholder.customersupport.CustomerSupportViewHolder
import com.example.yumarketforowners.presentation.viewholder.deliveryfee.DeliveryFeeViewHolder
import com.example.yumarketforowners.presentation.viewholder.itemmanage.ItemViewHolder
import com.example.yumarketforowners.presentation.viewholder.itemmanage.OptionGroupViewHolder
import com.example.yumarketforowners.presentation.viewholder.itemmanage.OptionViewHolder
import com.example.yumarketforowners.presentation.viewholder.notice.NoticeViewHolder
import com.example.yumarketforowners.presentation.viewholder.orderlist.OrderItemViewHolder
import com.example.yumarketforowners.presentation.viewholder.orderlist.OrderViewHolder
import com.example.yumarketforowners.presentation.viewholder.reviewmanage.ChatRoomViewHolder
import com.example.yumarketforowners.presentation.viewholder.reviewmanage.ReviewViewHolder
import kotlin.reflect.KClass

enum class CellType(
    val clazz: KClass<*>,
    @LayoutRes val layoutId: Int
) {
    ITEM_CELL(ItemViewHolder::class, R.layout.view_holder_item),
    REVIEW_CELL(ReviewViewHolder::class, R.layout.view_holder_review),
    CHAT_ROOM_CELL(ChatRoomViewHolder::class, R.layout.view_holder_chat_room),
    ORDER_CELL(OrderViewHolder::class, R.layout.view_holder_order),
    ORDER_ITEM_CELL(OrderItemViewHolder::class, R.layout.view_holder_order_item),
    OPTION_GROUP_CELL(OptionGroupViewHolder::class, R.layout.view_holder_option_group),
    OPTION_CELL(OptionViewHolder::class, R.layout.view_holder_option),
    NOTICE_CELL(NoticeViewHolder::class, R.layout.view_holder_notice),
    OPPONENT_CHAT_CELL(OpponentChatViewHolder::class, R.layout.view_holder_opponent_chat),
    MY_CHAT_CELL(MyChatViewHolder::class, R.layout.view_holder_my_chat),
    DELIVERY_FEE_CELL(DeliveryFeeViewHolder::class, R.layout.view_holder_delivery_fee),
    CUSTOMER_SERVICE_CELL(CustomerSupportViewHolder::class, R.layout.view_holder_faq),
}
