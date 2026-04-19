package ucb.edu.bo.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ucb.edu.bo.counter.presentation.viewmodel.CounterViewModel

@Composable
fun Screen(viewModel: CounterViewModel = CounterViewModel())
{
    val state = viewModel.stateString.collectAsState()

    Column (

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text( text = state.value)
        Button( onClick = {viewModel.increment()})
        {
            Text(text = "Add")
        }
    }

    /* var contador by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Valor: $contador"
        )

        Button(
            onClick = {
                contador++
            }
        ) {
            Text("Incrementar")
        }
    }*/
}
