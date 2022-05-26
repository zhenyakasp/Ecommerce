package com.example.ecommerce.presentation.market

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.ecommerce.ui.theme.EcommerceTheme

class MarketActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MarketScreen()
        }
    }

    @Composable
    private fun MarketScreen() {
        EcommerceTheme {

        }
    }
}