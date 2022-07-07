package com.example.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class State : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                val color1 = remember {
                    mutableStateOf(Color.Yellow)
                }
                val color2 = remember {
                    mutableStateOf(Color.Red)
                }

                ColorBox(
                    Modifier
                        .background(color2.value)
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    color1.value = it
                }

                ColorBox(
                    Modifier
                        .background(color1.value)
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    color2.value = it
                }
//                Box(modifier = Modifier
//                    .background(color1.value)
//                    .weight(1f)
//                    .fillMaxSize()
//                ) {
//
//                }
            }
        }
    }
}

@Composable
fun ColorBox(
    modifier : Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    ) {

    }
}
