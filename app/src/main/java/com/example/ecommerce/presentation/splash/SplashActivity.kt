package com.example.ecommerce.presentation.splash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ecommerce.presentation.market.MarketActivity
import com.example.ecommerce.ui.theme.EcommerceTheme
import com.example.ecommerce.ui.theme.Persimmon
import com.example.ecommerce.ui.theme.Stratos

class SplashActivity : ComponentActivity() {

    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SplashScreen()
        }

        with(viewModel) {
            viewModel.screenDelayed.observe(this@SplashActivity) { delayed ->
                if (delayed) {
                    startActivity(
                        Intent(
                            this@SplashActivity,
                            MarketActivity::class.java
                        )
                    )
                }
            }

            viewModel.launchDelay()
        }
    }

    @Composable
    private fun SplashScreen() {
        EcommerceTheme {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Stratos)
            ) {
                Box(modifier = Modifier.padding(start = 48.dp)) {
                    Canvas(
                        modifier = Modifier.size(132.dp),
                        onDraw = {
                            drawCircle(color = Persimmon)
                        }
                    )
                    Text(
                        text = "Ecommerce\nConcept ",
                        color = Color.White,
                        modifier = Modifier.padding(
                            start = 34.dp,
                            top = 32.dp
                        ),
                        style = MaterialTheme.typography.h4
                    )
                }
            }
        }
    }
}