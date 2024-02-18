import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    MaterialTheme(typography = defaultTypography) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().background(color = OffBlack)
        ) {
            ProfileCard(
                profilePicture = "image/avatar-jessica.jpeg",
                profileName = "Jessica Randall",
                profileLocation = "London, United Kingdom",
                profileDescription = "\"Front-end developer and avid reader.\"",
                profileLinks = listOf("GitHub", "Frontend Mentor", "LinkedIn", "Twitter", "Instagram")
            )
            ProfileCard(
                profilePicture = "image/avatar-jessica.jpeg",
                profileName = "Daniel Figueira",
                profileLocation = "Viseu, Lusitânia",
                profileDescription = "\"Badass programmer\"",
                profileLinks = listOf("GitHub", "Frontend Mentor", "LinkedIn", "Twitter", "Instagram")
            )
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

private val defaultTypography =
    Typography(defaultFontFamily = interFontFamily, body1 = TextStyle(fontSize = 14.sp, color = White))