package ucb.edu.bo.credittransfer.domain.model

import androidx.collection.LongIntMap

data class CreditTransferModel (
    val phoneNumberToTransfer: String,
    val amountOfTransfer: Int
)