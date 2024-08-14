package com.example.compose_quadrant

import android.os.Bundle
import android.speech.ModelDownloadListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_quadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ComposableInfoCard()
                }
            }
        }
    }
}


@Composable
fun ComposableInfoCard() {
    Column(modifier = Modifier.fillMaxHeight()) {
        Row(modifier = Modifier
                .fillMaxWidth()
        ) {
            FirstQuadrant(
                title_text = "Text composable",
                text_display = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier.weight(1f)
                    .fillMaxHeight(0.5f)
            )
            SecondQuadrant(
                title_Image = "Image composable",
                text_create = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
                    .fillMaxHeight(0.5f)
            )
        }
        Row(modifier = Modifier
                .fillMaxWidth()
        ) {
            ThirdQuadrant(
                title_row = "Row composable",
                text_layout = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
                    .fillMaxHeight(1f)

            )
            FourthQuadrant(
                title_column = "Column composable",
                text_layout_2 = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
                    .fillMaxHeight(1f)
            )
        }
    }
}



@Composable
fun FirstQuadrant(title_text: String, text_display: String, modifier: Modifier = Modifier) {
    val firstQuadrantColor = Color(0xFFEADDFF)
    Column(
        modifier = modifier
            .background(firstQuadrantColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title_text,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = text_display,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun SecondQuadrant(title_Image: String, text_create: String, modifier: Modifier = Modifier) {
    val secondQuadrantColor = Color(0xFFD0BCFF)
    Column(
        modifier = modifier
            .background(secondQuadrantColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title_Image,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = text_create,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun ThirdQuadrant(title_row: String, text_layout: String, modifier: Modifier = Modifier) {
    val thirdQuadrantColor = Color(0xFFB69DF8)
    Column(
        modifier = modifier
            .background(thirdQuadrantColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title_row,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = text_layout,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun FourthQuadrant(title_column: String, text_layout_2: String, modifier: Modifier = Modifier) {
    val thirdQuadrantColor = Color(0xFFF6EDFF)
    Column(
        modifier = modifier
            .background(thirdQuadrantColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title_column,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = text_layout_2,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_quadrantTheme {
        ComposableInfoCard()
    }
}