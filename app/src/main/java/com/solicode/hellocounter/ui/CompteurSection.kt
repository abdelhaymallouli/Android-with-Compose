package com.solicode.hellocounter.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@Composable
fun CompteurSection(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }

    Row(modifier = modifier) {
        IconButton(onClick = { if (count > 0) count-- }) {
            Icon(Icons.Filled.Remove, contentDescription = "Decrement")
        }
        Text(
            text = "$count",
            style = MaterialTheme.typography.headlineSmall
        )
        IconButton(onClick = { count++ }) {
            Icon(Icons.Filled.Add, contentDescription = "Increment")
        }
    }
}
