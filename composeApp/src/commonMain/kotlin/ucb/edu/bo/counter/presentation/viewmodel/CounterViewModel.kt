package ucb.edu.bo.counter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {
    //View model es para guardar datos


    //1 variable mutable
    private val _stateString: MutableStateFlow<String> = MutableStateFlow(value = "0")
    //2variable observable
    val stateString = _stateString.asStateFlow()

    //3 Evento desencadenador
    fun increment()
    {
        /*val valorActual = _stateString.value.toInt()
        val nuevoValor = valorActual + 1
        _stateString.value = nuevoValor.toString()*/

        _stateString.value = (_stateString.value.toInt() + 1).toString()

    }
}