package ucb.edu.bo.signin.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ucb.edu.bo.profile.presentation.state.ProfileEvent
import ucb.edu.bo.signin.presentation.state.SigninEffect
import ucb.edu.bo.signin.presentation.state.SigninEvent
import ucb.edu.bo.signin.presentation.state.SigninUiState

class SigninViewModel: ViewModel() {

    //mutable
    private val _state = MutableStateFlow<SigninUiState>(SigninUiState())

    //observable
    val state = _state.asStateFlow()
    private val _effect = MutableSharedFlow<SigninEffect>()
    val effect = _effect.asSharedFlow()


    //event

    fun onEvent(event: ProfileEvent.OnEmailChanged) {
        when( event) {
            SigninEvent.OnClick -> TODO()
            is SigninEvent.OnEmailChanged -> TODO()
            is SigninEvent.OnPasswordChanged -> TODO()
        }

    }



    //effects
    private fun emit(effect: SigninEffect){
        viewModelScope.launch { _effect.emit(effect) }
    }
}