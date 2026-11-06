package com.example.app_preuba.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_preuba.R

@Composable
fun LoginScreen() {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            // HEADER
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF2563EB),
                                Color(0xFF1D4ED8)
                            )
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.offset(y = 35.dp)
                ) {

                    Card(
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 18.dp
                        )
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.logo006),
                            contentDescription = "Logo PlopPlop",
                            modifier = Modifier
                                .padding(
                                    horizontal = 20.dp,
                                    vertical = 12.dp
                                )
                                .height(60.dp),
                            contentScale = ContentScale.Fit
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(16.dp)
                    )

                    Text(
                        text = "Tu transporte al instante",
                        color = Color.White.copy(alpha = 0.95f),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

            // TARJETA LOGIN
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-45).dp)
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(30.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 12.dp
                )
            ) {

                Column(
                    modifier = Modifier.padding(24.dp)
                ) {

                    Text(
                        text = "Iniciar Sesión",
                        style = MaterialTheme.typography.headlineSmall
                    )

                    Spacer(
                        modifier = Modifier.height(24.dp)
                    )

                    OutlinedTextField(
                        value = email,
                        onValueChange = {
                            email = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text("Correo electrónico")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = null
                            )
                        }
                    )

                    Spacer(
                        modifier = Modifier.height(16.dp)
                    )

                    OutlinedTextField(
                        value = password,
                        onValueChange = {
                            password = it
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text("Contraseña")
                        },
                        visualTransformation = PasswordVisualTransformation(),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null
                            )
                        }
                    )

                    Spacer(
                        modifier = Modifier.height(8.dp)
                    )

                    TextButton(
                        onClick = {}
                    ) {
                        Text("¿Olvidaste tu contraseña?")
                    }

                    Spacer(
                        modifier = Modifier.height(12.dp)
                    )

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(58.dp),
                        shape = RoundedCornerShape(18.dp)
                    ) {
                        Text(
                            text = "Ingresar",
                            fontSize = 16.sp
                        )
                    }

                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )

                    HorizontalDivider()

                    Spacer(
                        modifier = Modifier.height(20.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "¿No tienes cuenta?"
                        )

                        Spacer(
                            modifier = Modifier.width(6.dp)
                        )

                        TextButton(
                            onClick = {}
                        ) {
                            Text("Crear Cuenta")
                        }
                    }
                }
            }
        }
    }
}