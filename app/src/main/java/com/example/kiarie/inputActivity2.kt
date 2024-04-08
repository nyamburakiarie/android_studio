package com.example.kiarie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kiarie.ui.theme.KiarieTheme

class inputActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input() {

//    the purpose of lazy column is to enable you to scroll
    LazyColumn() {
        item {


//the purpose of box is
            Box(modifier = Modifier
                .fillMaxSize()
            ){

                Image(
                    painter = painterResource(id = R.drawable.car),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )



                Column(modifier = Modifier
                    .fillMaxSize(),

                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    var name by remember {
                        mutableStateOf(TextFieldValue(""))
                    }

                    TextField(value = name, onValueChange = {name = it}, label = {Text(text = "Enter your name")} )

                    Spacer(modifier = Modifier.height(30.dp))

                    var school by remember{
                        mutableStateOf(TextFieldValue(""))
                    }

                    TextField(value = school, onValueChange = {school = it})

                    Spacer(modifier = Modifier.height(30.dp))

                    var email by remember{
                        mutableStateOf(TextFieldValue(""))
                    }

                    TextField(value = email, onValueChange = {email = it})


                    Spacer(modifier = Modifier.height(30.dp))

                    var password by remember{
                        mutableStateOf(TextFieldValue(""))
                    }

                    OutlinedTextField(
                        value = password,
                        onValueChange = {password = it},
                        label = {Text(text = "password")},
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

                        leadingIcon = { Icon(imageVector = Icons.Default.Place , contentDescription = "" ) },
//         you can also use a trailing icon

                        textStyle = TextStyle(Color.White),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color.White,
                            unfocusedBorderColor = Color.Green,
                            focusedLabelColor = Color.White,
//             focused label color and focused border color should always match
                            unfocusedLabelColor = Color.White,
                            cursorColor = Color.White,
                            focusedLeadingIconColor = Color.White,
                            unfocusedLeadingIconColor = Color.White,



                            )


                    )













                }


            }
















        }
    }


    }




