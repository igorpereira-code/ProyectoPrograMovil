package ucb.edu.bo.signin.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import ucb.edu.bo.generated.resources.Res
//import ucb.edu.bo.generated.resources.sign_in_btn
//import ucb.edu.bo.generated.resources.sign_in_email
//import ucb.edu.bo.generated.resources.sign_in_password
//import ucb.edu.bo.generated.resources.sign_in_title
import ucb.edu.bo.signin.presentation.state.SigninEvent
import ucb.edu.bo.signin.presentation.viewmodel.SigninViewModel

@Composable
fun SigninScreen(viewModel: SigninViewModel = koinViewModel()){

    //var es mutable, val es inmutable
    var userSignIn by remember { mutableStateOf("") }
    var passwordSignIn by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column {
        var modifier = Modifier.fillMaxSize().padding(20.dp);
        var verticalArrangment = Arrangement.Center
        var horizontalAlignment = Alignment.CenterHorizontally

        //Text(text = stringResource(Res.string.sign_in_title))
        TextField(
            onValueChange = {
                email = it

            },
            value = email,
            //label = { Text(text = stringResource(Res.string.sign_in_email))}
        )
        TextField(
            onValueChange = {
                password = it

                //OnPasswordChanged(it))
            },
            value = password,
            //label = { Text(text = stringResource(Res.string.sign_in_password))}
        )
        Button(
            onClick = {})
        {
            //Text(text = stringResource(Res.string.sign_in_btn))
        }
    }
}


