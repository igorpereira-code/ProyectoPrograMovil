package ucb.edu.bo.home.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myproyect.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen()
{
    Column(
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 20.dp)
    ){
        Row (
            modifier = Modifier.background(Color.Red).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){

            Column {

                Text(text = "Explore", fontWeight = FontWeight.Bold, fontSize = 34.sp)
                Text(text = "Collections")
            }

            Image (
                painter = painterResource(resource = Res.drawable.Woman),
                contentDescription = null
            )

        }

        Box()
        {
            Image(
                painter = painterResource(resource = Res.drawable.Frame),
                contentDescription = null
            )
            Button(
                modifier = Modifier.align(Alignment.BottomCenter),
                onClick = { }
            )
            {
                Text(text = "Men")
            }

        }
        Box()
        {
            Image(
                painter = painterResource(resource = Res.drawable.frame),
                contentDescription = null
            )
            Button(
                onClick = { }
            )
            {
                Text(text = "Women")
            }

        }
        Box()
        {
            Image(
                painter = painterResource(resource = Res.drawable.frame),
                contentDescription = null
            )
            Button(
                onClick = { }
            )
            {

                Text(text = "Children")

            }

        }
    }
}
