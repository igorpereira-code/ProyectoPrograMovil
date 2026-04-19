package ucb.edu.bo.kmp_room.dollar.domain.repository

import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel

interface DollarRepository {
    suspend fun save(model: DollarModel)
    suspend fun getList(): List<DollarModel>
}