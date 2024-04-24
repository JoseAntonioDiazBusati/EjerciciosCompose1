import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun Ejercicio4() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Subrow1(color = Color.Red)
        Spacer(modifier = Modifier.width(20.dp))
        Subrow2(color = Color.Blue)
        Spacer(modifier = Modifier.width(20.dp))
        Subrow3(color = Color.Red)
        Spacer(modifier = Modifier.width(20.dp))
        Subrow4(color = Color.Blue)
    }
}

@Composable
fun Subrow1(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(400.dp)
            .border(2.dp, color = color),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(text = "Ejemplo1")
    }
}

@Composable
fun Subrow2(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(250.dp)
            .border(2.dp, color = color),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(text = "Ejemplo2")
    }
}

@Composable
fun Subrow3(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(125.dp)
            .border(2.dp, color = color),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(text = "Ejemplo3")
    }
}

@Composable
fun Subrow4(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(25.dp)
            .border(2.dp, color = color),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(text = "Ejemplo4")
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 4 Compose",
        state = windowState
    ){
        Ejercicio4()
    }
}