package ucb.edu.bo.profile.presentation.state

data class ProfileUiState (
    val name: String = "",
    val email: String = "",
    val phone: String = "",
    val description: String = "",
    val image: String = ""
)