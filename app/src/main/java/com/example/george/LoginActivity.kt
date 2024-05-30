package com.example.george

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.sign


class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Let()
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun Let() {
    var name by remember {mutableStateOf(TextFieldValue(""))}
    var email by remember {mutableStateOf(TextFieldValue(""))}
    val login = LocalContext.current
    var sign = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "LogIn:",
            color = Color.White,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic

        )
        Image(
            modifier = Modifier

                .clip(RoundedCornerShape(80.dp))

            ,
            painter = painterResource(id = R.drawable.logo),
            contentDescription = " ",)
        
        Text(
            text = "Come back with your ID",
            color = Color.Green,
            fontSize = 10.sp,

        )
        Text(
            text = "for easy,fast and secure login",
            fontSize = 5.sp,
            color = Color.Green


        )
        Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(5.dp)
            .padding(horizontal = 400.dp)
        )
        
        OutlinedTextField(
            value = name,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Red,
                unfocusedLabelColor = Color.Red,
                focusedLabelColor = Color.Red,

            ),
            onValueChange = {name=it} ,
            label = {Text(text="name")},


                )


                


        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Red,
                unfocusedLabelColor = Color.Red,
                focusedLabelColor = Color.Red,
            ),
            onValueChange = {name=it} ,
            label = {Text(text="Enter Email")},
            modifier = Modifier.height(200.dp)


        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                login.startActivity(Intent(login, LoginActivity::class.java))

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(5.dp),


            ) {
            Text(
                text = "Login"

            )

        }

        Text(
            text = "Don't have an account?",
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "SignUp",
            modifier = Modifier
                .clickable{sign .startActivity(Intent(sign,LoginActivity ::class.java))}
        )





    }}
// visualTransformation = PasswordVisualTransformation()
//this is how you hide password





