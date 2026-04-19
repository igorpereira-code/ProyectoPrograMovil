package ucb.edu.bo.kmp_room.dollar.data.mapper

import ucb.edu.bo.kmp_room.dollar.data.entity.DollarEntity
import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel

fun DollarModel.toEntity() = DollarEntity(
    dollarOfficial,
    dollarParallel
)

fun DollarEntity.toModel() =  DollarModel(
    id,
    dollarOfficial,
    dollarParallel
)