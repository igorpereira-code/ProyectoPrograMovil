package ucb.edu.bo

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import ucb.edu.bo.localization.presentation.screen.LocalizationScreen
import ucb.edu.bo.pushnotification.presentation.screen.PushNotificationScreen
import ucb.edu.bo.realtimedatabasecmp.presentation.screen.FirebaseTestScreen
import ucb.edu.bo.remoteconfig.presentation.screen.RemoteConfigScreen


@Composable
@Preview
fun App() {
    MaterialTheme {
        //FirebaseTestScreen()
        //DollarScreen()
        //PushNotificationScreen()
        //RemoteConfigScreen()
        LocalizationScreen()

        }
    }
