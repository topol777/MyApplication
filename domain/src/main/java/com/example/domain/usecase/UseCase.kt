package com.example.domain.usecase

import com.example.domain.repository.Repository

abstract class UseCase<T, R>(
    private val repository: Repository,
) {
    abstract suspend fun execute(param: T): R
}
