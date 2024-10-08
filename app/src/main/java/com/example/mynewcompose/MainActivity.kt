package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.Greeting
import com.example.mynewcompose.ui.theme.MynewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MynewComposeTheme {
                MySuperText("")
            }
        }
    }
}

@Preview(
    name = "preview 1 guay",
    heightDp = 50,
    widthDp = 200,
    showBackground = true,
    showSystemUi = true,
    apiLevel = 34,
    device = Devices.NEXUS_5
)
@Composable
fun MyTestSuperText() {
    MySuperText("Pepe")

}


@Composable
fun MySuperText(name: String) {
    Text(
        text = "soy juanesito xd y tu $name", modifier = Modifier
            .fillMaxSize()
            .padding(horizontal =20.dp)
            .clickable {  }
    )
}