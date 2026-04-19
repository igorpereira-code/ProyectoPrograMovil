package ucb.edu.bo.kmp_room.dollar.data.datasource

import ucb.edu.bo.kmp_room.dollar.data.entity.DollarEntity

interface DollarLocalDataSource {
    suspend fun save(entity: DollarEntity)
    suspend fun list() : List<DollarEntity>
}