package ucb.edu.bo.profile.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ucb.edu.bo.profile.presentation.state.ProfileEffect
import ucb.edu.bo.profile.presentation.state.ProfileEvent
import ucb.edu.bo.profile.presentation.state.ProfileUiState
import ucb.edu.bo.signin.presentation.state.SigninEffect
import ucb.edu.bo.signin.presentation.state.SigninEvent
import ucb.edu.bo.signin.presentation.state.SigninUiState


class ProfileViewModel(

) {

    private val _state = MutableStateFlow<ProfileUiState>(ProfileUiState())

    //observable
    val state = _state.asStateFlow()
    private val _effect = MutableSharedFlow<ProfileEffect>()
    val effect = _effect.asSharedFlow()

    fun onEvent(event: ProfileEvent) {
        when( event) {
            ProfileEvent.OnClick -> TODO()
            is ProfileEvent.OnEmailChanged -> TODO()
            is ProfileEvent.OnNameChanged -> TODO()
            is ProfileEvent.OnPhoneChanged -> TODO()
            is ProfileEvent.OnDescriptionChanged -> TODO()
            is ProfileEvent.OnImageChanged -> TODO()
        }

    }

    private fun emit(effect: ProfileEffect){

    }

}