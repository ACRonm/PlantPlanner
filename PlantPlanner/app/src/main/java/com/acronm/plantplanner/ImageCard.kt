package com.acronm.plantplanner

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageCard(title: String, description: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.height(400.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurfaceVariant
        ),
    shape = MaterialTheme.shapes.large
    ) {
            Image(
                painter = painterResource(id = R.drawable.plant),
                contentDescription = "Plant",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(70.dp)
                    .clip(shape = MaterialTheme.shapes.large)
                    .fillMaxWidth()
                    .aspectRatio(3f/2f)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(40.dp)
                ) {
                    Text(
                        text = "Get Started",
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
    }
}

@Preview
@Composable
fun ImageCardPreview() {
            ImageCard(
                title = "Plant",
                description = "This is a plant",
                modifier = Modifier
                    .height(240.dp)
                    .fillMaxWidth()
            )
}

