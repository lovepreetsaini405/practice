package com.example.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FirstScreen(
                         stringResource(id = R.string.first_paragraph),
                         stringResource(id = R.string.second_paragraph),
                         stringResource(id = R.string.third_paragraph),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun FirstScreen(first: String, second:String , third: String ,modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column(modifier){
        Image(
            painter = image,
            contentDescription =null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = first,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Right,
            modifier = modifier
                .align(alignment = Alignment.Start)

        )
        Text(
            text = second,
            fontSize = 15.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            text = third,
            fontSize = 15.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier
        )







    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticeTheme {
        FirstScreen(
            stringResource(id = R.string.first_paragraph),
            stringResource(id = R.string.second_paragraph),
            stringResource(id = R.string.third_paragraph)
        )

    }
}