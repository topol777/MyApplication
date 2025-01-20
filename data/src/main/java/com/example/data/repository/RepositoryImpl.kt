package com.example.data.repository

import com.example.data.api.BinService
import com.example.data.db.dao.BinDao
import com.example.data.utils.FlowUtils.asResult
import com.example.data.utils.ModelUtils.toEntity
import com.example.domain.model.CardInfo
import com.example.domain.model.Result
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val dao: BinDao,
    private val service: BinService,
) : Repository {
    override suspend fun getCardInfo(bin: Long): Flow<Result<List<CardInfo>>> =
        flow {
            val cardInfo =
                service.getInfo(bin).let { response ->
                    if (!response.isSuccessful) throw HttpException(response)
                    response.body()?.toModel(bin) ?: throw HttpException(response)
                }
            dao.saveCard(cardInfo.toEntity())
            val allCards = dao.getAllCards().map { it.toModel() }
            emit(allCards)
        }.asResult()

    override suspend fun deleteCardInfo(date: Long): Flow<Result<List<CardInfo>>> =
        flow {
            dao.deleteCard(date)
            val allCards = dao.getAllCards().map { it.toModel() }
            emit(allCards)
        }.asResult()

    override suspend fun fetchAllFromDb(): Flow<Result<List<CardInfo>>> =
        flow {
            val allCards = dao.getAllCards().map { it.toModel() }
            emit(allCards)
        }.asResult()
}
