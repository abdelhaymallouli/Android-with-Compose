package com.solicode.hellocounter.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.widthIn
import androidx.compose.ui.res.stringResource


@Composable
fun CompteurSection(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { if (count > 0) count-- }) {
            Icon(
                Icons.Filled.Remove,
                contentDescription = stringResource(R.string.cd_decrement)
            )
        }

        Text(
            text = "$count",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.widthIn(min = 40.dp)
        )

        IconButton(onClick = { count++ }) {
            Icon(
                Icons.Filled.Add,
                contentDescription = stringResource(R.string.cd_increment)
            )
        }
    }
}
