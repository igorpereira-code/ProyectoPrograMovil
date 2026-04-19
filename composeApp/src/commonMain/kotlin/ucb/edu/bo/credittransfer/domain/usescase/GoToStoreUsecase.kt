package ucb.edu.bo.credittransfer.domain.usescase

import ucb.edu.bo.credittransfer.domain.model.CreditTransferModel
import ucb.edu.bo.credittransfer.domain.repository.CreditTransferRepository

class GoToStoreUsecase (
    val repository: CreditTransferRepository
){
    suspend fun invoke(model: CreditTransferModel){
        repository.navigateToStore(model)
    }
}