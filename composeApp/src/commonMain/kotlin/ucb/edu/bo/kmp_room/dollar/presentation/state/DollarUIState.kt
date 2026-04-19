package ucb.edu.bo.kmp_room.dollar.presentation.state

import ucb.edu.bo.kmp_room.dollar.domain.model.DollarModel

data class DollarUIState(
    val list: List<DollarModel> = emptyList(),
    val isLoading: Boolean = true
)