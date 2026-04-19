package ucb.edu.bo.recoverpassword.domain.repository

import ucb.edu.bo.recoverpassword.domain.model.RecoverPasswordModel

interface RecoverPasswordRepository {

    suspend fun findEmail(model: RecoverPasswordModel)

    suspend fun openWhatssApp(model: RecoverPasswordModel)

    suspend fun returnToPreviousPage(model: RecoverPasswordModel)


}