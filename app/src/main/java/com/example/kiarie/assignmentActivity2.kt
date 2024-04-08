package com.example.kiarie

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kiarie.ui.theme.KiarieTheme

class assignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        Greeting4()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting4() {

    LazyColumn(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
    ) {
        item {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {

                    Image(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Location")

                        Row {
                            Image(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)

                            )
                            Text(text = "Nairobi")
                        }

                    }

                    Image(imageVector = Icons.Default.Settings, contentDescription = "")

                }
//
                Spacer(modifier = Modifier.height(15.dp))


                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.Cyan)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Holiday")

                    }

                }



                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Holiday")

                    }

                }

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)


                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Hotels")

                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {
                        Image(
                            imageVector = Icons.Default.Home,
                            contentDescription = "",
                        )
                        Text(text = "Holiday")

                    }

                }
                
                Spacer(modifier = Modifier.height(10.dp))

                Row(
                ) {

                    Text(text = "Popular")

                    Spacer(modifier = Modifier.width(60.dp))

                    Text(text = "View All")

                }
                Spacer(modifier = Modifier.height(10.dp))

                Row {

                    Spacer(modifier = Modifier.width(40.dp))
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.dark),
                            contentDescription = "", modifier = Modifier
                                .clip(RoundedCornerShape(10))
                                .size(100.dp)
                        )

                        Text(text = "beautiful people")

                    }
                    Spacer(modifier = Modifier.width(85.dp))

                    Column {
                        Spacer(modifier = Modifier.width(85.dp))
                        Image(
                            painter = painterResource(id = R.drawable.bomacompound),
                            contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(10))
                                .size(100.dp)
                        )

                        Text(text = "Imagination")
                    }

                }
                Spacer(modifier = Modifier.width(85.dp))

                Row {
                    Spacer(modifier = Modifier.height(10.dp))

                    Spacer(modifier = Modifier.width(40.dp))
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.city),
                            contentDescription = "", modifier = Modifier
                                .clip(RoundedCornerShape(10))
                                .size(100.dp)
                        )

                        Text(text = "feel at home")

                    }
                    Spacer(modifier = Modifier.width(85.dp))

                    Column {
                        Spacer(modifier = Modifier.width(85.dp))
                        Image(
                            painter = painterResource(id = R.drawable.gate),
                            contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(10))
                                .size(100.dp)
                        )

                        Text(text = "What can i say")
                    }

                }


            }
        }

    }
}