package com.cleancode.app.feature_note.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending: OrderType()
}
