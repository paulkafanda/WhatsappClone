package com.example.whatsapprun

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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.whatsapprun.ui.theme.WhatsappRunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WhatsappRunTheme(
                darkTheme = false,
                dynamicColor = true
            ) {

//                window.statusBarColor = colorScheme.primary.toArgb()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WhatsAppLayout()
                }
            }
        }
    }
}


@Composable
fun WhatsAppLayout(){

    val camera = painterResource(id = R.drawable.photo_camera_48px)
    val search = painterResource(id = R.drawable.search_48px)
    val more = painterResource(id = R.drawable.more_vert_48px)
    val group = painterResource(id = R.drawable.groups_48px)

    Column {
        Column(
            modifier = Modifier
                .background(Color(0xFF118385))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "WhatsApp",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .padding(start = 12.dp),
                    color = Color.White
                )


                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = camera,
                        contentDescription = "more",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Icon(
                        painter = search,
                        contentDescription = "camera",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Icon(
                        painter = more,
                        contentDescription = "search",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(28.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Icon(
                    painter = group,
                    contentDescription = "group",
                    tint = Color.White,
                    modifier = Modifier
                        .size(32.dp)
                )
                Text(
                    text = "Chats",
                    color = Color.White, fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "Status",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )
                Text(
                    text = "Calls",
                    color = Color.White,
                    fontFamily = FontFamily.SansSerif
                )

            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 12.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            repeat(20) {
                Spacer(modifier = Modifier.height(12.dp))
                Card()
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }


}

@Composable
fun Card() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = R.drawable.unj05av8_400x400),
            contentDescription = "user",
            modifier = Modifier
                .size(52.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "John Doe",
                    color = Color(R.color.gray_10),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "28/06/23",
                    color = Color(R.color.gray_500),
                    fontSize = 12.sp
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Hey, what's up ?", color = Color(R.color.gray_500))
                Text(
                    text = "28",
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color(0xFF118385))
                        .padding(4.dp)
                )
            }
        }
    }
}

@Composable
fun ImageViewer() {
    Box(modifier = Modifier) {

    }
}

@Preview(showBackground = true)
@Composable
fun WhatsAppLayoutPreview() {
    WhatsappRunTheme {
        WhatsAppLayout()
    }
}

