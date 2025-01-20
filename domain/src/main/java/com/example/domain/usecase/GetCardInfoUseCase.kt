package com.example.domain.usecase

import com.example.domain.model.CardInfo
import com.example.domain.model.Result
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCardInfoUseCase @Inject constructor(
    private val repository: Repository,
) : UseCase<Long, Flow<Result<List<CardInfo>>>>(repository) {
    override suspend fun execute(bin: Long) = repository.getCardInfo(bin)
}
