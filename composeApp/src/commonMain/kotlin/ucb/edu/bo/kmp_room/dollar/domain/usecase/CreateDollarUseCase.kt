package ucb.edu.bo.kmp_room.dollar.domain.usecase

import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel
import ucb.edu.bo.kmp_room.dollar.domain.repository.DollarRepository

class CreateDollarUseCase(
    private val repository: DollarRepository
) {

    suspend fun invoke(model: DollarModel) {
        repository.save(model)
    }
}