package com.example.data.utils

import com.example.data.db.entities.CardInfoEntity
import com.example.domain.model.CardInfo

object ModelUtils {
    fun CardInfo.toEntity() =
        CardInfoEntity(
            bin,
            country,
            coordinates?.first,
            coordinates?.second,
            scheme,
            brand,
            bankInfo,
            date,
        )
}
