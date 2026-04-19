package ucb.edu.bo.profile.presentation.state

import ucb.edu.bo.signin.presentation.state.SigninEffect

sealed interface ProfileEffect {
    //data class tiene atributos
    //cuando no se tiene atributos es un objeto
    data class ShowError(
        val message: String
    ): ProfileEffect

    object NavigateToHome: ProfileEffect
}