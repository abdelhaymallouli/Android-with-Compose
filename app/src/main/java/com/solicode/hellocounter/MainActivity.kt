package com.solicode.hellocounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.solicode.hellocounter.ui.MainScreen
import com.solicode.hellocounter.ui.theme.HelloCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloCounterTheme {
                MainScreen()
            }
        }
    }
}
