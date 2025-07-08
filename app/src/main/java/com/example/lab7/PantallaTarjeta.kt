package com.example.lab7

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab7.R

@Composable
fun PantallaTarjeta(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Imagen circular del bot
            Image(
                painter = painterResource(id = R.drawable.jose_bot),
                contentDescription = "Foto del bot",
                modifier = Modifier
                    .size(150.dp)
                    .padding(top = 16.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "José Encalada",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Estudiante de Ingeniería en Sistemas",
                style = MaterialTheme.typography.bodyMedium
            )

            Divider(Modifier.padding(vertical = 8.dp))

            ContactSection()
            RedesSection()
            HabilidadesSection()
        }
    }
}

@Composable
fun ContactSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)
    ) {
        Text("📧 Correos:", fontWeight = FontWeight.SemiBold)
        Text("• jose.encalada1407@gmail.com")
        Text("• jose.encalada@utp.ac.pa")
    }
}

@Composable
fun RedesSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)
    ) {
        Text("🌐 Redes:", fontWeight = FontWeight.SemiBold)
        Text("• GitHub: https://github.com/balgxmr")
        Text("• LinkedIn: jose-encalada-b342a7357")
    }
}

@Composable
fun HabilidadesSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 8.dp)
    ) {
        Text("🧠 Habilidades:", fontWeight = FontWeight.SemiBold)

        val habilidades = listOf(
            "HTML, CSS, Bootstrap",
            "React, PHP, Java, JavaScript",
            "C, C++ (básico)",
            "MySQL, PostgreSQL, Oracle",
            "Admin. de Linux",
            "Git & GitHub"
        )

        habilidades.forEach {
            Text("• $it")
        }
    }
}
