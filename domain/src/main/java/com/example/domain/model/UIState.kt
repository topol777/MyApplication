package com.example.domain.model

sealed class UIState {
    data object Loading : UIState()

    data class Error(
        val messageRes: Int,
        val code: Int? = null,
    ) : UIState()

    data class Cards(
        val list: List<CardInfo> = listOf(),
    ) : UIState()
}
