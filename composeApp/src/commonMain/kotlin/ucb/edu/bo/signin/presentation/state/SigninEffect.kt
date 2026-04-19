package ucb.edu.bo.signin.presentation.state

sealed interface SigninEffect {
    //data class tiene atributos
    //cuando no se tiene atributos es un objeto
    data class ShowError(
        val message: String
    ): SigninEffect

    object NavigateToHome: SigninEffect



}