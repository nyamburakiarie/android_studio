package com.example.kiarie

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kiarie.ui.theme.KiarieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Greeting()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .fillMaxHeight(),

// alternatively you can  .fillMaxSize to cater for both width and height

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
        ){
            Text(text = "Home")
            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "About")
            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Settings")

        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "My Home Page",
            fontSize = 30.sp,
            modifier = Modifier.background(Color.DarkGray)
        )
        Text(text = " Welcome Mon Ami",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            modifier = Modifier.background(Color.Gray)
        )

        val about = LocalContext.current
        Button(onClick = { about.startActivity(Intent(about, AboutActivity2::class.java)) },

            colors = ButtonDefaults.buttonColors(Color.Black),
//            shape = RectangleShape
//            shape = RoundedCornerShape(12.dp)
            shape = CutCornerShape(30),
            border = BorderStroke(1.dp, Color.White)
        )
        {
            Text(text = "About screen", color = Color.Magenta)
        }

        Spacer(modifier = Modifier.height(30.dp))
//
//        val x = AnnotatedString("click here to go home")
//        val y = LocalContext.current
//
//        ClickableText(text = x, onClick = {
//            y.startActivity(Intent(y, AboutActivity2::class.java))
//        }) {
//
//        }





    }







}





