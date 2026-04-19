package ucb.edu.bo.credittransfer.domain.repository

import ucb.edu.bo.credittransfer.domain.model.CreditTransferModel

interface CreditTransferRepository {

    suspend fun transfer(model: CreditTransferModel)

    suspend fun searchForCompletedTrasfers(model: CreditTransferModel)

    suspend fun returnToPreviousPage(model: CreditTransferRepository)

    suspend fun navigateToStore(model: CreditTransferModel)




}