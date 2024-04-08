package com.example.kiarie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kiarie.ui.theme.KiarieTheme

class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Greeting2(

)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting2() {

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
        ) {
            Text(text = "Home")
            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "About")
            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Settings")

        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "this is my about page",
            fontSize = 30.sp,
            modifier = Modifier.background(Color.DarkGray)
        )
        Text(
            text = " mon ami you are my friend",
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            modifier = Modifier.background(Color.Gray)
        )

        val about = LocalContext.current
        Button(
            onClick = { about.startActivity(Intent(about, MainActivity::class.java)) },

            colors = ButtonDefaults.buttonColors(Color.Transparent),
//            shape = RectangleShape
//            shape = RoundedCornerShape(12.dp)
            shape = CutCornerShape(30),
            border = BorderStroke(1.dp, Color.DarkGray)
        )
        {
            Text(text = "About screen", color = Color.DarkGray)
        }

        Spacer(modifier = Modifier.height(30.dp))

        val kk = AnnotatedString("click here to go home")
        val hh = LocalContext.current

        ClickableText(text = kk, onClick = {
            hh.startActivity(Intent(hh, MainActivity::class.java))
        })

        val zz = LocalContext.current
        Text(text = "Click here",
            modifier = Modifier
                .clickable{
                    zz.startActivity(Intent(zz, inputActivity2::class.java))
                }
            )

        val pp = LocalContext.current
        Text(text = "Click here",
            modifier = Modifier
                .clickable{
                    pp.startActivity(Intent(pp, assignmentActivity2::class.java))
                }
        )

        val bb = AnnotatedString("image activity")
        val dd = LocalContext.current

        ClickableText(text = bb, onClick = {
            dd.startActivity(Intent(hh, imageActivity2::class.java))
        })

        val cc = LocalContext.current
        Text(text = "webpage",
            modifier = Modifier.clickable{
                cc.startActivity(Intent(cc, webpageActivity2::class.java))
            })

        val ee = LocalContext.current
        Text(text = "access photos", modifier = Modifier.clickable{ee.startActivity(Intent(ee, webpageActivity2::class.java))})





    }



}



