package EjerciciosIniciales

import androidx.compose.foundation.background
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
fun Ejercicio5() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(1000.dp)
                .height(150.dp)
                .background(Color.Cyan  )
        ) {
            Text(
                text = "BOX 1",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .width(1000.dp)
                .height(150.dp)
                .background(Color.Gray)
        ) {
            Text(
                text = "BOX 2",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.height(80.dp))
        Box(
            modifier = Modifier
                .width(1000.dp)
                .height(150.dp)
                .background(Color.Green)
        ) {
            Text(
                text = "BOX 3",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .width(1000.dp)
                .height(150.dp)
                .background(Color.Magenta)
        ) {
            Text(
                text = "BOX 4",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}


fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejercicio 5 Compose",
        state = windowState
    ){
        Ejercicio5()
    }
}