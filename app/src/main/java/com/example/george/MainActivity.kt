package com.example.george

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            George()

        }
    }
}




@Preview(showBackground = true)
@Composable
fun George() {
    val about = LocalContext.current
    val contact = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "android",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic

        )
        Text(
            text = "welcome",
            color = Color.Red,
            fontFamily = FontFamily.Serif,
        )
        Text(
            text = "First Android Class",
        )








        Button(
            onClick = {
                      about.startActivity(Intent(about, AboutActivity::class.java))

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(5.dp),


            ) {
            Text(
                text = "About"
            )

        }


        Button(
            onClick = {
                contact.startActivity(Intent(contact, ContactActivity::class.java))

            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(5.dp),


            ) {
            Text(
                text = "Contact"

            )

        }






        Image(
            modifier = Modifier

                .clip(RoundedCornerShape(10.dp))
                .border(3.dp, Color.Black)
                    ,
            painter = painterResource(id = R.drawable.logo),
            contentDescription = " ",)





































    }


}
