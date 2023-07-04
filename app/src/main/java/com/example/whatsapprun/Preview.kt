package com.example.whatsapprun

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsapprun.ui.theme.WhatsappRunTheme


@Preview(showBackground = true)
@Composable
fun ImagePreviewerActionBarPreview() {
    WhatsappRunTheme {
        ImagePreviewerActionBar()
    }
}


@Preview(showBackground = true)
@Composable
fun HeaderComponentPreview() {
    MaterialTheme {
        HeaderComponent()
    }
}
@Composable
fun UserProfile(){

}
@Preview(showBackground = true)
@Composable
fun UserProfilePreview() {
    MaterialTheme {
        UserProfile()
    }
}

@Preview(showBackground = true)
@Composable
fun MyStatusComponentPreview() {
    MaterialTheme {
        MyStatusComponent()
    }
}

@Preview(showBackground = true)
@Composable
fun StatusComponentPreview() {
    MaterialTheme{
        StatusComponent()
    }

}

@Preview(showBackground = true)
@Composable
fun WhatsAppLayoutPreview() {
    WhatsappRunTheme {
        WhatsAppLayout()
    }
}