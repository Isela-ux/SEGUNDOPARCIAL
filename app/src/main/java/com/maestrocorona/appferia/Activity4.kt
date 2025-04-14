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

class Activity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nave2Screen()
        }
    }
}

@Composable
fun Nave2Screen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text(
                text = "Bienvenido a la Nave 2",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Imagen de la Nave 2",
                modifier = Modifier.size(250.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = """
                    En la Nave 2, descubrirás los sabores auténticos y tradicionales de nuestra región. 
                    Aquí encontrarás una increíble selección de platillos típicos, desde los más emblemáticos 
                    hasta las innovaciones culinarias que reflejan nuestra cultura.
                    No te pierdas la oportunidad de disfrutar de una variedad de platillos, 
                    postres y bebidas que han sido cuidadosamente elaborados para brindarte una experiencia gastronómica única
                """.trimIndent(),
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier.padding(16.dp)
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
