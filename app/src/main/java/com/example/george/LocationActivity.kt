package com.example.george

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.george.ui.theme.GeorgeTheme

class LocationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            proj()

            }
        }
    }


@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun proj(){
    var search by remember { mutableStateOf(TextFieldValue("")) }
Box(modifier = Modifier
    .fillMaxSize()
)
    Image(painter = painterResource(id = R.drawable.br),
        contentDescription = null, )
        Column{
            Text(
                text = "Location",
                color = Color.White,
            )
            Spacer(
                modifier = Modifier
                    .padding(10.dp)
            )

            Row(
                modifier = Modifier
                    .padding(1.dp)
                    .fillMaxWidth(),

                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top,

                )
            {
            }

            5Z

                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_down),
                    contentDescription = "arrow down icon",
                    tint = Color.DarkGray,
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { }
                )


            }}



