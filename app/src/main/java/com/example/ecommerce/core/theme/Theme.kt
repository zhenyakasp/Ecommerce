package com.example.ecommerce.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.example.ecommerce.core.theme.Typography

@Composable
fun EcommerceTheme(content: @Composable () -> Unit) {
    MaterialTheme(
            colors = lightColors(
                primary = Purple500,
                primaryVariant = Purple700,
                secondary = Teal200
            ),
            typography = Typography,
            shapes = Shapes,
            content = content
    )
}