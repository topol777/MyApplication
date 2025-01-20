package com.example.binonline.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.binonline.R
import com.example.domain.model.CardInfo
import com.example.domain.model.ErrorType
import com.example.domain.model.Result
import com.example.domain.model.UIState
import com.example.domain.usecase.DeleteCardInfoUseCase
import com.example.domain.usecase.FetchAllCardsUseCase
import com.example.domain.usecase.GetCardInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val getCardInfoUseCase: GetCardInfoUseCase,
    private val fetchAllCardsUseCase: FetchAllCardsUseCase,
    private val deleteCardInfoUseCase: DeleteCardInfoUseCase,
) : ViewModel() {
    private val _state: MutableStateFlow<UIState> = MutableStateFlow((UIState.Loading))
    val state: StateFlow<UIState> = _state.asStateFlow()

    init {
//        getCard(31023120)
        fetchAllCards()
    }

    private suspend fun changeUIState(result: Flow<Result<List<CardInfo>>>) {
        result.collect {
            _state.value =
                when (it) {
                    is Result.Error -> getErrorState(it)
                    is Result.Loading -> UIState.Loading
                    is Result.Success -> UIState.Cards(it.data)
                }
        }
    }

    private fun getErrorState(result: Result.Error): UIState.Error {
        val code: Int? = result.errorCode
        val stringRes: Int =
            when (result.type) {
                ErrorType.REQUEST_LIMIT -> R.string.error_limit
                ErrorType.CLIENT_ERROR -> R.string.error_client
                ErrorType.SERVER_ERROR -> R.string.error_server
                ErrorType.HTTP_UNKNOWN_ERROR -> R.string.error_unknown_http
                ErrorType.NETWORK_ERROR -> R.string.error_network
                ErrorType.UNKNOWN_ERROR -> R.string.error_unknown
            }

        return UIState.Error(stringRes, code)
    }

    fun fetchAllCards() =
        viewModelScope.launch {
            changeUIState(fetchAllCardsUseCase.execute(Unit))
        }

    fun deleteCard(date: Long) =
        viewModelScope.launch {
            changeUIState(deleteCardInfoUseCase.execute(date))
        }

    fun getCard(bin: Long) =
        viewModelScope.launch {
            changeUIState(getCardInfoUseCase.execute(bin))
        }
}
