import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import java.io.File

val Green = Color.hsl(75F, 0.94F, 0.57F)
val White = Color.hsl(0F, 0F, 1F)
val Grey = Color.hsl(0F, 0F, 0.2F)
val DarkGrey = Color.hsl(0F, 0F, 0.12F)
val OffBlack = Color.hsl(0F, 0F, 0.08F)

val interFontFamily = FontFamily(
    Font(File("font/Inter-Bold.ttf").path, weight = FontWeight.W700, style = FontStyle.Normal),
    Font(File("font/Inter-Regular.ttf").path, weight = FontWeight.W400, style = FontStyle.Normal),
    Font(File("font/Inter-SemiBold.ttf").path, weight = FontWeight.W600, style = FontStyle.Normal),
)