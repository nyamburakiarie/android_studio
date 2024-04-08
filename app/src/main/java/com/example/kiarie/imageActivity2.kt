package com.example.kiarie

import android.graphics.Color
import android.graphics.ColorFilter
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import com.example.kiarie.ui.theme.KiarieTheme

class imageActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
       Greeting3()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting3() {

    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .background(androidx.compose.ui.graphics.Color.White)
    )
    {

        Text(text = "images on my page", color = androidx.compose.ui.graphics.Color.Black                                                                                                                                                                                                                                                               )

       Image(painter = painterResource(id = R.drawable.gate), contentDescription = "", modifier = Modifier
           .size(200.dp)
           .clip(RoundedCornerShape(20))

           ,
//
//           colorFilter = ColorFilter.tint(Color.Blue)
           )

        AsyncImage(
            model = "https://static.dezeen.com/uploads/2020/08/biodivercity-big-architecture-masterplan-penang_dezeen_2364_col_0-852x479.jpg",
            contentDescription = null,
        )



    }

}