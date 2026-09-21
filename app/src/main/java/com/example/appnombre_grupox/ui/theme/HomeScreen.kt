package com.example.appnombre_grupox.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import com.example.appnombre_grupox.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen() {
    // darkScheme es una funcion del material 3
    val colorScheme = darkColorScheme(
        primary = Color(0xFF98222E),
        onPrimary = Color.White,
        onSurface = Color(0xFF3333333)
    ) // fin dark

    MaterialTheme(
        colorScheme= ColorScheme
    ) {
        // Scafold va a generar una pantalla basica
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("Mi primer app") })
            }
            // InnerPadding se refiere al espacio que entrega Scaffold para el contenido
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(paddingValues = innerPadding)
                    .fillMaxSize()
                    .padding(all = 16.dp)
                    .background(Color(0xFFF0F0F0))
                ,
                verticalArrangement = Arrangement.spacedBy(20.dp),
                // centrar
                horizontalAligment = Alignment.CenterHorizontally
            ) {
                Text(text = "¡Bienvenido Como esta!",
                    style = MaterialTheme.typography.headlineMedium)
                Button(onClick = {/*Accion futura*/ }) {
                    Text("Presioname")
                }
                // Fila con icono decorativo
                Image(
                    painter = painterResource(id = R.drawable.logo_duoc),
                    contentDescription = "Logo App",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}