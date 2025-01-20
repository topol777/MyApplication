package com.example.domain.usecase

import com.example.domain.model.CardInfo
import com.example.domain.model.Result
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchAllCardsUseCase @Inject constructor(
    private val repository: Repository,
) : UseCase<Unit, Flow<Result<List<CardInfo>>>>(repository) {
    override suspend fun execute(param: Unit) = repository.fetchAllFromDb()
}
