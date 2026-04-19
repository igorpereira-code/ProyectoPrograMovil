package ucb.edu.bo.profile.domain.repository

import ucb.edu.bo.profile.domain.model.ProfileModel

interface ProfileRepository {
    suspend fun update(profile: ProfileModel)
    suspend fun findById(id: String): ProfileModel
    suspend fun deleteById(id: String)
}