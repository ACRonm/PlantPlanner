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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantPlannerTheme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ){
                    Row(modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name,
                            onValueChange = {
                                    text -> name = text
                                            },
                            modifier = Modifier
                                .weight(1f),
                        )
                        Spacer (modifier = Modifier.width(8.dp))
                        Button(onClick = {
                            if (name.isNotBlank())
                                names = names + name
                                name = ""
                        })
                        {
                            Text(text = "Add")
                        }
                    }

                    LazyColumn {
                        items(names.size) {
                            Text(text = names[it],
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth())
                            Divider()
                        }
                    }
                }
            }
        }
    }
}
