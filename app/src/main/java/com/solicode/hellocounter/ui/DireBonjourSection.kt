package com.solicode.hellocounter.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.solicode.hellocounter.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DireBonjourSection(modifier: Modifier = Modifier) {
    var name by rememberSaveable { mutableStateOf("") }
    var greetingName by rememberSaveable { mutableStateOf<String?>(null) }

    Column(modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(stringResource(R.string.label_firstname)) },
            placeholder = { Text(stringResource(R.string.ph_firstname)) }
        )

        Button(
            onClick = { greetingName = name.takeIf { it.isNotBlank() } },
            enabled = name.isNotBlank()
        ) {
            Text(stringResource(R.string.btn_greet))
        }

        if (greetingName != null) {
            AssistChip(
                onClick = { },
                label = { Text("Bonjour $greetingName") }
            )
        }
    }
}
