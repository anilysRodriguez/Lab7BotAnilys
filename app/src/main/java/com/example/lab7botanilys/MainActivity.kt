package com.example.lab7botanilys

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard() {
    val context = LocalContext.current
    val linkedinUrl = "https://www.linkedin.com/in/anilys-rodriguez-588a96207/?originalSubdomain=pa"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .verticalScroll(rememberScrollState())
            .padding(48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.botani),
            contentDescription = "Avatar",
            modifier = Modifier.size(200.dp)
        )

        Text(
            text = "CodeLynx",
            fontSize = 26.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )

        // Profesión
        Text(
            text = "Ingeniera de Software",
            fontSize = 18.sp,
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        Text(
            text = "Propietaria de CodeLynx: Anilys Rodríguez",
            fontSize = 18.sp,
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        // Teléfono
        Text(
            text = "Teléfono: +507 6001-1122",
            fontSize = 16.sp,
            color = Color.LightGray
        )

        // Lenguajes y herramientas
        Text(
            text = "Lenguajes: JavaScript, C#, manejo de ASP.NET",
            fontSize = 16.sp,
            color = Color.LightGray,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Conocimientos: Power Platform, Power BI",
            fontSize = 16.sp,
            color = Color.LightGray
        )

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "2025",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 16.dp, bottom = 24.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedinUrl))
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF006D3A))
        ) {
            Text(text = "Ir al link de LinkedIn", color = Color.White)
        }
    }
}