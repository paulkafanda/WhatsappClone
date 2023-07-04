package com.example.whatsapprun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.whatsapprun.ui.theme.WhatsappRunTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import io.github.serpro69.kfaker.faker


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WhatsappRunTheme(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true
            ) {
                WhatsAppLayout()
            }
        }
    }
}


@Composable
fun WhatsAppLayout(){


    val systemUiController = rememberSystemUiController()

//                systemUiController.setSystemBarsColor(Color(0xFF118385), darkIcons = isSystemInDarkTheme())
    systemUiController.setStatusBarColor(Color(0xFF118385), darkIcons = isSystemInDarkTheme())
    systemUiController.setNavigationBarColor(Color.Transparent, navigationBarContrastEnforced = true)



    val camera = painterResource(id = R.drawable.photo_camera_48px)
    val search = painterResource(id = R.drawable.search_48px)
    val more = painterResource(id = R.drawable.more_vert_48px)
    val group = painterResource(id = R.drawable.groups_48px)
    val profilePics = setOf(
        R.drawable.pro_095d2b032a754346b4bd84fa3ded5bff_jpg_1200w_1200h_1s,
        R.drawable.pro_0b36fe3068c6474aa8bddd33a48c272b_jpg_1200w_1200h_1s,
        R.drawable.pro_128396fcfffa430c9f78c9a80265e20c_jpg_1200w_1200h_1s,
        R.drawable.pro_11ca1b58ae6b49fb84f39d159d7c9c31_jpg_1200w_1200h_1s,
        R.drawable.pro_170388045e464228934ca7ed16413614_jpg_1200w_1200h_1s,
        R.drawable.pro_1c237af0c9f3438787920d396d7319b9_jpg_1200w_1200h_1s,
        R.drawable.pro_1e10f872512e4eafa273183122bdaf9f_jpg_1200w_1200h_1s,
        R.drawable.pro_338f6c8fec624b9c89095adf29c4ee13_jpg_1200w_1200h_1s,
        R.drawable.pro_0bddc5b6724347d7992a925c378d0a12_jpg_1200w_1200h_1s,
        R.drawable.pro_49c28c1458f241fbb3e97105c92288aa_jpg_1200w_1200h_1s,
        R.drawable.pro_4a0692cbca2e4781843b73c4af6abdf2_jpg_1200w_1200h_1s,
        R.drawable.pro_5120ffd706ef43cbbb9042c4b7ad51cb_jpg_1200w_1200h_1s,
        R.drawable.pro_61704a9198de4db4856ecee656a3a9ab_jpg_1200w_1200h_1s,
        R.drawable.pro_1c237af0c9f3438787920d396d7319b9_jpg_1200w_1200h_1s,
        R.drawable.pro_6efed50045e044cd9839f57429b8747e_jpg_1200w_1200h_1s,
        R.drawable.pro_7952a1a291b54b86b6499001881d281f_jpg_1200w_1200h_1s,
        R.drawable.pro_7e0c6cbeddf04abcb62b1227799dd480_jpg_1200w_1200h_1s,
        R.drawable.pro_836d7d8bccbe40369dcd5250005099a6_jpg_1200w_1200h_1s,
        R.drawable.pro_86f6099b731c436aa2efed0ff7b5eea5_jpg_1200w_1200h_1s,
        R.drawable.pro_8fe1db5d33a8403abc2aab2517de88a2_jpg_1200w_1200h_1s,
        R.drawable.pro_963f1c503be84d9e982e31435d639393_jpg_1200w_1200h_1s,
        R.drawable.pro_9b9cde140f994b308422ecb5db165aed_jpg_1200w_1200h_1s,
        R.drawable.pro_9c4b47a4aa18480e8a162ae3d3580426_jpg_1200w_1200h_1s,
        R.drawable.pro_e98479265969457e85d1f35cff505c32_jpg_1200w_1200h_1s,
    )
    val faker = faker {  }

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
                    color = Color.White, fontFamily = FontFamily.SansSerif,
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
            repeat(200) {
                Spacer(modifier = Modifier.height(12.dp))
                Card(profilePics.random(), faker.name.neutralFirstName(), faker.bigBangTheory.quotes().substring(0..7))
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }


}