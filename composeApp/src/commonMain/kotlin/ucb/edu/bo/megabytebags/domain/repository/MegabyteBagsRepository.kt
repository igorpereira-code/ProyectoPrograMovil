package ucb.edu.bo.megabytebags.domain.repository

import ucb.edu.bo.megabytebags.domain.model.MegabyteBagsModel

interface MegabyteBagsRepository {
    suspend fun buyMegabyteBag(model: MegabyteBagsModel)

    suspend fun goToPromotions(model: MegabyteBagsModel)

    suspend fun goToMoreBags(model: MegabyteBagsModel)

    suspend fun goToMinutesBags(model: MegabyteBagsModel)
}