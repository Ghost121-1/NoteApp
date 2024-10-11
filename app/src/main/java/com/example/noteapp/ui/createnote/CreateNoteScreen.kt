package com.example.noteapp.ui.createnote

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CreateNote(
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Create Note")
        Button(onClick = { onBackClick.invoke() }) {
            Text(text = "Back")
        }
    }
}