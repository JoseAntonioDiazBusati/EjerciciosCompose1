import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun Ejercicio3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Subcolumna1(color = Color.Red)
        Subcolumna2(color = Color.Gray)
        Subcolumna3(color = Color.Cyan)
        Subcolumna4(color = Color.Green)
    }
}

@Composable
fun Subcolumna1(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(150.dp)
            .background(color),
        contentAlignment = Alignment.TopCenter
    ){
        Text("Ejemplo1")
    }
}

@Composable
fun Subcolumna2(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(250.dp)
            .background(color),
        contentAlignment = Alignment.TopCenter
    ){
        Text("Ejemplo2")
    }
}

@Composable
fun Subcolumna3(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(250.dp)
            .background(color),
        contentAlignment = Alignment.TopCenter
    ){
        Text("Ejemplo3")
    }
}

@Composable
fun Subcolumna4(color: Color) {
    Box(
        modifier = Modifier
            .width(100.dp)
            .height(150.dp)
            .background(color),
        contentAlignment = Alignment.TopCenter
    ){
        Text("Ejemplo4")
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 3 Compose",
        state = windowState
    ){
        Ejercicio3()
    }
}