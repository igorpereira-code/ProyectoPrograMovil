package ucb.edu.bo.profile.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.viewmodel.koinViewModel
import ucb.edu.bo.generated.resources.Res
import ucb.edu.bo.generated.resources.lapiz
import ucb.edu.bo.generated.resources.profile
//import ucb.edu.bo.generated.resources.profile_description
//import ucb.edu.bo.generated.resources.profile_email
//import ucb.edu.bo.generated.resources.profile_name
//import ucb.edu.bo.generated.resources.profile_phone
import ucb.edu.bo.profile.presentation.state.ProfileEvent
import ucb.edu.bo.signin.presentation.viewmodel.SigninViewModel


@Composable
fun ProfileScreen(viewModel: SigninViewModel = koinViewModel()) {
    var email by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {

                Image(
                    painter = painterResource(Res.drawable.profile),
                    contentDescription = null
                )

            TextField(
                onValueChange = {
                    name = it

                },
                value = name,
                //label = { Text(text = stringResource(Res.string.profile_name))}
            )
            TextField(
                onValueChange = {
                    email = it
                    viewModel.onEvent(ProfileEvent.OnEmailChanged(it))
                },
                value = email,
                //label = { Text(text = stringResource(Res.string.profile_email))}
            )
            TextField(
                onValueChange = {
                    phone = it

                },
                value = phone,
                //label = { Text(text = stringResource(Res.string.profile_phone))}
            )
            TextField(
                onValueChange = {
                    description = it

                },
                value = description,
                //label = { Text(text = stringResource(Res.string.profile_description))}
            )

        }
        Button(
            onClick = { },
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .size(60.dp)
        ) {
            Image(
                painter = painterResource(Res.drawable.lapiz),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit

            )
        }
    }
}
