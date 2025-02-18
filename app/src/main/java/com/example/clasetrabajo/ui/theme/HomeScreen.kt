package com.example.clasetrabajo.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun HomeScreen(){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    ){
        Text("Main Menu")
    }
}