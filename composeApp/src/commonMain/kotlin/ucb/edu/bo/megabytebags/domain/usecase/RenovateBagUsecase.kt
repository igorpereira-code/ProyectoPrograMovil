package ucb.edu.bo.megabytebags.domain.usecase

import ucb.edu.bo.megabytebags.domain.model.MegabyteBagsModel
import ucb.edu.bo.megabytebags.domain.repository.MegabyteBagsRepository

class RenovateBagUsecase(
    val repository: MegabyteBagsRepository
) {
    suspend fun invoke(model: MegabyteBagsModel){
        repository.buyMegabyteBag(model)
    }
}