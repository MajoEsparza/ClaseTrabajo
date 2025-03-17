package screens

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.clasetrabajo.ui.theme.LightBlue100
import com.example.clasetrabajo.ui.theme.LightBlue900
import com.example.clasetrabajo.ui.theme.Pink40
import com.example.clasetrabajo.ui.theme.Pink80
import com.example.clasetrabajo.ui.theme.Purple40
import com.example.clasetrabajo.ui.theme.Purple80
import com.example.clasetrabajo.ui.theme.PurpleGrey40
import com.example.clasetrabajo.ui.theme.PurpleGrey80
import com.example.clasetrabajo.ui.theme.Typography

private val DarkColorScheme = darkColorScheme(
    primary = LightBlue900,
    secondary = PurpleGrey80,
    tertiary = Pink80,

    )

private val LightColorScheme = lightColorScheme(
    primary = LightBlue100,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ClaseTrabajoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}