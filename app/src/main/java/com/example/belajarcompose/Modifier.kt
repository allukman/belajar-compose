package com.example.belajarcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class Modifier : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
//                    .padding(top = 100.dp)
                    .border(5.dp, Color.Red)
                    .padding(5.dp)
                    .border(5.dp, Color.Green)
                    .padding(5.dp)
                    .border(5.dp, Color.White)
                    .padding(5.dp)
            ) {
                Text(text = "Hello", color = Color.White, modifier = Modifier
                    .clickable {
                        Toast.makeText(this@Modifier, "Hello", Toast.LENGTH_SHORT).show()
                    })
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World", color = Color.White)
            }
        }
    }
}
