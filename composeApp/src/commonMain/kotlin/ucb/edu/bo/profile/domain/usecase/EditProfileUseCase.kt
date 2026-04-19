package ucb.edu.bo.profile.domain.usecase

import ucb.edu.bo.profile.domain.model.ProfileModel
import ucb.edu.bo.profile.domain.repository.ProfileRepository

class EditProfileUseCase(
    val repository: ProfileRepository
){
    suspend fun invoke(model: ProfileModel){
        repository.update(model)
    }
}