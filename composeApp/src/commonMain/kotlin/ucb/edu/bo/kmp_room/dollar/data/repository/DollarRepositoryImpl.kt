package ucb.edu.bo.kmp_room.dollar.data.repository

import ucb.edu.bo.kmp_room.dollar.data.datasource.DollarLocalDataSource
import ucb.edu.bo.kmp_room.dollar.data.mapper.toEntity
import ucb.edu.bo.kmp_room.dollar.data.mapper.toModel
import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel
import ucb.edu.bo.kmp_room.dollar.domain.repository.DollarRepository

class DollarRepositoryImpl(
    val localDataSource: DollarLocalDataSource
): DollarRepository {
    override suspend fun save(model: DollarModel) {
        localDataSource.save(model.toEntity())
    }

    override suspend fun getList(): List<DollarModel> {
        return localDataSource.list().map {
            it.toModel()
        }
    }
}