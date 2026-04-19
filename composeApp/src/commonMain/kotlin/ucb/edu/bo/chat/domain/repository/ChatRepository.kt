package ucb.edu.bo.chat.domain.repository

import ucb.edu.bo.chat.domain.model.ChatModel

interface ChatRepository {
    suspend fun sendMessage(model: ChatModel)

    suspend fun deleteMessage(model: ChatModel)

    suspend fun editMessage(model: ChatModel)
}