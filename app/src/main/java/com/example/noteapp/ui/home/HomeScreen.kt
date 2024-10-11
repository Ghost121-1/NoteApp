package com.example.noteapp.ui.home

import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    openCreatNote: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Home")
        Button(onClick = { openCreateNote.invoke() }) {
            Text(text = "Next")
        }
    }
}