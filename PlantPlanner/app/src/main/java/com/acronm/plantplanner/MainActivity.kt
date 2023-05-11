package com.acronm.plantplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acronm.plantplanner.ui.theme.PlantPlannerTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardLayout() {
    Column(
        modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
    ) {
        Text(
            text = "Plant Planner",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(10) {
                ElevatedCard(onClick = { /*TODO*/ }) {
                    Column(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                    ) {
                        Text(
                            text = "Plant Name",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Plant Description",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Plant Date",
                            style = MaterialTheme.typography.labelSmall
                        )
                }
                }
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