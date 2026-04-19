package ucb.edu.bo.chat.domain.usecase

import ucb.edu.bo.chat.domain.model.ChatModel
import ucb.edu.bo.chat.domain.repository.ChatRepository

class EditMessageUseCase(
    val repository: ChatRepository
) {
    suspend fun invoke(model: ChatModel){
        repository.editMessage(model)
    }
}