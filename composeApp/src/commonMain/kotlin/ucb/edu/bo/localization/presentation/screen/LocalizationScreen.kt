package ucb.edu.bo.localization.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource
import ucb.edu.bo.generated.resources.*
import ucb.edu.bo.generated.resources.Res

@Composable
fun LocalizationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(Res.string.app_title),
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(Res.string.welcome_message),
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = {}) {
            Text(stringResource(Res.string.button_save))
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(onClick = {}) {
            Text(stringResource(Res.string.button_cancel))
        }
    }
}