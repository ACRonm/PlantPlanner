package com.acronm.plantplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.acronm.plantplanner.card.Style
import com.acronm.plantplanner.card.Type
import com.acronm.plantplanner.ui.theme.PlantPlannerTheme
import com.acronm.plantplanner.card.Card

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantPlannerTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background)
                {
                    CardLayout()
                }
            }
        }
    }
}

@Composable
fun CardLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        //text
        Text(
            text = "Plant Planner",
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.titleLarge,
        )


        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(10) {
                Card(
                    type = Type.Stacked,
                    style = Style.Outlined,
                    showIconButton = false,

                )
            }
        }
    }
}



@Preview (showBackground = true)
@Composable
fun CardLayoutPreview() {
    PlantPlannerTheme {
        CardLayout()
    }
}