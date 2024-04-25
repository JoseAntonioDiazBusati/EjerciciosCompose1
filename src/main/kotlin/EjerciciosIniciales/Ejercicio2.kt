package EjerciciosIniciales

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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

fun Ejercicio2(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Box(
            modifier = Modifier
                .width(325.dp)
                .height(200.dp)
                .background(Color.Cyan)
                .align(Alignment.Center)
        ){
            Text(
                text = "Esto es un EJEMPLO del uso de Box",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
    }
}
fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 2 Compose",
        state = windowState
    ){
        Ejercicio2()
    }
}