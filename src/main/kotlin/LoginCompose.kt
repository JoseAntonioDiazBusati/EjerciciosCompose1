import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlin.system.exitProcess


@Preview
fun main()= application {
    val windowState = rememberWindowState(size = DpSize(1200.dp,800.dp))
    Window(
        onCloseRequest = ::exitApplication,
        title = "Login",
        state = windowState
    ){
        PantallaInicio()
    }
}

@Composable
fun PantallaInicio(){
    val usuario = remember { mutableStateOf(TextFieldValue("")) }
    val password = remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(
            value = usuario.value,
            label = { Text(text = "Nombre del usuario")},
            onValueChange = { usuario.value = it },
            modifier = Modifier
                .width(200.dp)
                .height(75.dp)
        )
        OutlinedTextField(
            value = password.value,
            label = { Text(text = "Introduzca contraseña")},
            onValueChange = { password.value = it },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .width(200.dp)
                .height(75.dp)
        )
        Button(
            onClick ={},
        ){
            Text(text = "Login")
        }
        Button(
            onClick ={ exitProcess(0)},
        ){
            Text(text = "Salir")
        }
    }
}