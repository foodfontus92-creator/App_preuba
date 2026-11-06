package com.example.app_preuba.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.app_preuba.R

@Composable
fun HomeScreen() {

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
        ) {

            // HEADER

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF2563EB),
                                Color(0xFF1D4ED8)
                            )
                        )
                    )
                    .padding(24.dp)
            ) {

                Column {

                    Text(
                        text = "Hola 👋",
                        color = Color.White,
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    Text(
                        text = "¿A dónde vamos hoy?",
                        color = Color.White
                    )
                }
            }


            // BUSCADOR DE VIAJES
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-40).dp)
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(28.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 12.dp
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = "Buscar destino",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(
                        modifier = Modifier.height(12.dp)
                    )

                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(24.dp),
                        placeholder = {
                            Text("¿A dónde quieres ir?")
                        }
                    )

                    Spacer(
                        modifier = Modifier.height(16.dp)
                    )

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        Text("Buscar Conductor")
                    }
                }
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .offset(y = (-20).dp)
            ) {

                // SERVICIOS
                Text(
                    text = "Servicios",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {

                    ServiceCard(
                        emoji = "🚗",
                        title = "Económico"
                    )

                    ServiceCard(
                        emoji = "🚙",
                        title = "Comfort"
                    )

                    ServiceCard(
                        emoji = "🚐",
                        title = "XL"
                    )
                }

                Spacer(
                    modifier = Modifier.height(24.dp)
                )

                // VIAJES RECIENTES
                Text(
                    text = "Viajes recientes",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                RecentTripCard(
                    origin = "Casa",
                    destination = "Centro"
                )

                Spacer(
                    modifier = Modifier.height(10.dp)
                )

                RecentTripCard(
                    origin = "Mall",
                    destination = "Universidad"
                )

                Spacer(
                    modifier = Modifier.height(30.dp)
                )
            }
        }
    }
}

@Composable
fun ServiceCard(
    emoji: String,
    title: String
) {

    Card(
        modifier = Modifier
            .width(110.dp)
            .height(110.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = emoji,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text = title,
                color = Color.Black
            )
        }
    }
}

@Composable
fun RecentTripCard(
    origin: String,
    destination: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(28.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = "📍 $origin"
            )

            Spacer(
                modifier = Modifier.height(6.dp)
            )

            Text(
                text = "➡️ $destination"
            )
        }
    }
}