package ucb.edu.bo.kmp_room.dollar.data.service

import ucb.edu.bo.kmp_room.dollar.data.dao.DollarDao
import ucb.edu.bo.kmp_room.dollar.data.datasource.DollarLocalDataSource
import ucb.edu.bo.kmp_room.dollar.data.entity.DollarEntity

class DbService(val dollarDao: DollarDao): DollarLocalDataSource {
    override suspend fun save(entity: DollarEntity) {
        dollarDao.insert(entity)
    }

    override suspend fun list(): List<DollarEntity> {
        return dollarDao.getList()
    }
}