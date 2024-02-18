import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(
    profilePicture: String,
    profileName: String,
    profileLocation: String,
    profileDescription: String,
    profileLinks: List<String>
) {

    Column(
        modifier = Modifier.width(350.dp).padding(horizontal = 16.dp)
            .background(color = DarkGrey, shape = RoundedCornerShape(8.dp)).padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.padding(bottom = 12.dp).clip(CircleShape),
            painter = painterResource(resourcePath = profilePicture),
            contentDescription = "Profile Picture"
        )
        Text(profileName, modifier = Modifier.padding(bottom = 8.dp), fontWeight = FontWeight.W700, fontSize = 28.sp)
        Text(profileLocation, modifier = Modifier.padding(bottom = 24.dp), fontWeight = FontWeight.W600, color = Green)
        Text(
            profileDescription,
            modifier = Modifier.padding(bottom = 12.dp),
            fontWeight = FontWeight.W400,
            fontSize = 12.sp
        )
        profileLinks.forEach { ProfileButton(it) }
    }
}

@Composable
private fun ProfileButton(text: String) {
    Button(
        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(8.dp)),
        colors = ButtonDefaults.buttonColors(backgroundColor = Grey, contentColor = White),
        onClick = {}
    ) { Text(text, fontWeight = FontWeight.W600) }
}