package ucb.edu.bo.kmp_room.dollar.domain.usecase

import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel
import ucb.edu.bo.kmp_room.dollar.domain.repository.DollarRepository

class GetDollarListUsecase(
    val repository: DollarRepository
) {

    suspend fun invoke(): List<DollarModel> {
        return repository.getList()
    }
}