import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun MainScreen() {
    Surface(
        color = Color.Yellow,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(Alignment.Center)
        ) {
            Text(
                text = "Hola caracola!!",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(20.dp)
            )
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplos para practicar",
        state = windowState
    ){
        MainScreen()
    }
}
