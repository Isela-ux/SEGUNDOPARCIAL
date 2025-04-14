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

class Activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Nave1Screen()
        }
    }
}

@Composable
fun Nave1Screen() {
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
                text = "Bienvenido a la Nave 1",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.logo_nave),
                contentDescription = "Imagen de la Nave 1",
                modifier = Modifier.size(250.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = """
                    La Nave 1 de nuestra feria está dedicada a la tecnología más avanzada. 
                    En ella encontrarás las últimas innovaciones en dispositivos electrónicos, 
                    gadgets futuristas, y demostraciones de inteligencia artificial, 
                    robótica y realidad virtual.
                    Esta es una oportunidad única para conocer cómo la tecnología está 
                    transformando nuestra vida diaria y cómo el futuro se está construyendo hoy.
                """.trimIndent(),
                style = TextStyle(fontSize = 16.sp),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "¡Ven y vive la experiencia de la cultura tabasqueña!",
                style = TextStyle(fontSize = 20.sp, fontWeight = androidx.compose.ui.text.font.FontWeight.Bold),
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}
