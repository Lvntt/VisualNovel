package com.example.visualnovel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.example.visualnovel.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualNovelTheme {
                Novel()
            }
        }
    }
}

@Composable
fun Novel(modifier: Modifier = Modifier) {
    HomeScreen()
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    // TODO import as svg
    Image(
        painter = painterResource(id = R.drawable.home_background),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier.fillMaxSize()
    )
    Column {
        Spacer(modifier = modifier.weight(2f))
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .background(PrimaryColor, RectangleShape)
                .weight(1f)
        ) {
            Text(
                text = "Моя визуальная новелла",
                textAlign = TextAlign.Center,
                style = TitleTextStyle,
                modifier = Modifier.fillMaxWidth(),
                color = Color.White
            )
        }
        Spacer(modifier = modifier.weight(2f))
        Box(
            contentAlignment = Alignment.Center,
        modifier = modifier
            .background(SecondaryColor, RectangleShape)
            .weight(0.33f)
        ) {
            Text(
                text = "Начать",
                textAlign = TextAlign.Center,
                style = LabelTextStyle,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                               // TODO navigate
                    },
            )
        }
        Spacer(modifier = modifier.weight(2f))
    }
}