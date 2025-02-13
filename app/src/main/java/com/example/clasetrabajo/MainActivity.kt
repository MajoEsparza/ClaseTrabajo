package com.example.clasetrabajo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clasetrabajo.ui.theme.ClaseTrabajoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*enableEdgeToEdge()*/
        setContent {
            ClaseTrabajoTheme {
                Column() {
                    Column() {
                        TextComposable("Karime")
                        TextComposable()
                        TextComposable()
                        TextComposable()

                    }
                    Row() {
                        TextComposable()
                        TextComposable()
                        TextComposable()
                        TextComposable()
                    }
                    Column {
                        ModifierExample2()
                        ModifierExample4()
                        CustomText()
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun TextComposable(name: String = "Empty") {
        Text("Welcome")
        Text(name)
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample1() {
        Column(
            modifier = Modifier
                .padding(24.dp, 10.dp)
        ) {
            Text("Hello World")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample2() {
        Column(
            modifier = Modifier
                .padding(24.dp)
                /*Cubre toda la pantalla*/
                .fillMaxSize()
                .clickable(onClick = { clickAction() })
        ) {
            Text("Hello World")
        }
    }

    fun clickAction() {
        println("Column Clicked")
    }

    @Preview(showBackground = true)
    @Composable
    fun ModifierExample3() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .background(Color.Cyan)
                .border(width = 2.dp, color = Color.Black)
                .width(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly

        ) {
            TextComposable("1")
            TextComposable("2")
            TextComposable("3")
            TextComposable("4")
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun ModifierExample4(){
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .padding(10.dp)
                .height(300.dp)
                .width(300.dp)
        ){
            //Text on top
            Text("1", Modifier.align(Alignment.TopStart))
            Text("2", Modifier.align(Alignment.TopCenter))
            Text("3", Modifier.align(Alignment.TopEnd))
            //Text on center
            Text("4", Modifier.align(Alignment.CenterStart))
            Text("5", Modifier.align(Alignment.Center))
            Text("6", Modifier.align(Alignment.CenterEnd))
            //Text on bottom
            Text("7", Modifier.align(Alignment.BottomStart))
            Text("8", Modifier.align(Alignment.BottomCenter))
            Text("9", Modifier.align(Alignment.BottomEnd))
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun CustomText(){
        Column() {
            //usage of strings.xml to save a sample String
            Text(
                //shift tab to delete a tab line
                stringResource(R.string.example_text),
                color = colorResource(R.color.purple_500),
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold
            )
            //creating a list of colors to use it in the gradient
            val gradientColors =
                listOf(Color.Red, Color.Blue, Color.Green, colorResource(R.color.black))
            Text(
                stringResource(R.string.example_text),
                style = TextStyle(brush = Brush.horizontalGradient(colors = gradientColors))
            )
        }
    }
}




