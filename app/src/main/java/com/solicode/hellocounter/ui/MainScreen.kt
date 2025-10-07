package com.solicode.hellocounter.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.solicode.hellocounter.ui.theme.HelloCounterTheme
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DireBonjourSection()
        CompteurSection()
    }
}


@Preview(showBackground = true, widthDp = 360)
@Composable
fun PreviewMainScreen() {
    HelloCounterTheme {
        MainScreen()
    }
}
