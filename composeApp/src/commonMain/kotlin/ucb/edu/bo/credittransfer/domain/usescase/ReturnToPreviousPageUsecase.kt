package ucb.edu.bo.credittransfer.domain.usescase

import ucb.edu.bo.credittransfer.domain.repository.CreditTransferRepository

class ReturnToPreviousPageUsecase(
    val repository: CreditTransferRepository
) {
    suspend fun invoke(model: CreditTransferRepository){
        repository.returnToPreviousPage(model)
    }
}