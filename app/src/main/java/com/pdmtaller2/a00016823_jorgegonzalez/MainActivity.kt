package com.pdmtaller2.a00016823_jorgegonzalez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.a00016823_jorgegonzalez.layout.Layout
import com.pdmtaller2.a00016823_jorgegonzalez.ui.theme._00016823_JorgeGonzalezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _00016823_JorgeGonzalezTheme {
                Layout()
            }
        }
    }
}