package com.example.livelocation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LocationScreen(
    locationText: String,
    onStartTracking: () -> Unit,
    onStopTracking: () -> Unit
) {

    val backgroundBrush = Brush.linearGradient(
        colors = listOf(
            Color(0xFF200122),
            Color(0xFF5A0C7B)
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundBrush)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.location),
            contentDescription = "Location Icon",
            modifier = Modifier.width(250.dp)
        )
        Text(
            text = "Live Location App",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = locationText,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onStartTracking,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color(0xFF200122)
            )
        ) {
            Text("Start Live Location")
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onStopTracking,
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Transparent,
                contentColor = Color.White
            ),
            border = BorderStroke(1.dp, Color.White)
        ) {
            Text("Stop Location")
        }
    }
}