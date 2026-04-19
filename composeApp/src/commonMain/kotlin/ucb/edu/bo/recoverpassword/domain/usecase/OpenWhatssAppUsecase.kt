package ucb.edu.bo.recoverpassword.domain.usecase

import ucb.edu.bo.recoverpassword.domain.model.RecoverPasswordModel
import ucb.edu.bo.recoverpassword.domain.repository.RecoverPasswordRepository

class OpenWhatssAppUsecase(
    val repository: RecoverPasswordRepository
) {
    suspend fun invoke(model: RecoverPasswordModel){
        repository.openWhatssApp(model)
    }
}