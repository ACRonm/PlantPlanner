package com.acronm.plantplanner

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ImageCardRelay(title: String, description: String, modifier: Modifier = Modifier) {
    ImageCard(title = title, description = description)
}