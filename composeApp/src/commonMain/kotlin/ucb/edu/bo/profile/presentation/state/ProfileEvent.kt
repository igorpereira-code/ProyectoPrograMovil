package ucb.edu.bo.profile.presentation.state

import ucb.edu.bo.signin.presentation.state.SigninEvent

sealed interface ProfileEvent {
    data class OnEmailChanged(val value: String) : ProfileEvent

    data class OnNameChanged(val value: String) : ProfileEvent

    data class OnPhoneChanged(val value: String) : ProfileEvent

    data class OnDescriptionChanged(val value: String) : ProfileEvent

    data class OnImageChanged(val value: String) : ProfileEvent

    object OnClick: ProfileEvent
}