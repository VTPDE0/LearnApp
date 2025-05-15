package com.example.myapplication.features.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.myapplication.Shared.ui.CustomInputField
import com.example.myapplication.ui.theme.Black
import com.example.myapplication.ui.theme.Chinablue
import com.example.myapplication.ui.theme.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight



@Composable
fun LogInScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }

    val focusManager = LocalFocusManager.current

    Scaffold { innerPadding ->
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = Chinablue)
        ) {

            Text("Hey :)",  color = White, fontSize = 25.sp, fontWeight = FontWeight.W900)
            Text("")
            Text("Welcome back!", color = White, fontSize = 25.sp, fontWeight = FontWeight.W900)
            Text("")

            CustomInputField(
                value = email,
                label = "Email",
                onChange = {
                    email = it
                },
                keyboardType = KeyboardType.Email
            )


            CustomInputField(
                value = password,
                label = "Password",
                onChange = {
                    password = it
                },
                keyboardType = KeyboardType.Password
            )



            OutlinedButton(
                modifier = Modifier.padding(top = 20.dp),
                colors = ButtonColors(White, Black, White, White),
                onClick = {

                }

            ) {
                Text("Registration")
            }

        }
    }
}

@Preview
@Composable
fun LogInScreen_Preview(){
    LogInScreen()
}