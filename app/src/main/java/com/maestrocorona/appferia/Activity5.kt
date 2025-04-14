package com.maestrocorona.appferia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Activity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nave3Screen()
        }
    }
}

@Composable
fun Nave3Screen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text(
                text = "Bienvenido a la nave 3  ",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.logo_res), // Asegúrate de poner la imagen en drawable
                contentDescription = "Artesanías Tabasqueñas",
                modifier = Modifier.size(300.dp).padding(bottom = 20.dp)
            )

            Text(
                text = """
                    En la Nave 3, encontrarás una selecta variedad de puestos con las más bellas artesanías de la región de Tabasco. 
                    Disfruta de la riqueza cultural que ofrecen nuestros artesanos locales. 
                    Te invitamos a explorar y admirar productos únicos, hechos a mano con amor y tradición. 
                    Desde piezas de barro hasta tejidos en palma, cada obra es una muestra de la destreza y el arte de los habitantes de esta región. 
                    ¡No te pierdas la oportunidad de llevarte un recuerdo auténtico y original de Tabasco!
                """.trimIndent(),
                style = TextStyle(fontSize = 16.sp, lineHeight = 24.sp),
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "¡Ven y vive la experiencia de la cultura tabasqueña!",
                style = TextStyle(fontSize = 20.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold),
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}
