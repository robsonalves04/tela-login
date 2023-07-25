package com.example.korpay_tela_login.views.screens.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.korpay_tela_login.R
import com.example.korpay_tela_login.ui.theme.Korpay_tela_loginTheme




@Composable
fun TelaInicial (onNavigate: () -> Unit) {

    Box(
        Modifier
            .fillMaxSize()
    ) {

        val image = painterResource(id = R.drawable.imagem_1)
        Image(
            painter = image, contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        )
        Text(
            text = "Korpay",
            modifier = Modifier
                .align(Alignment.Center)
                .padding(end = 104.dp),
            fontWeight = FontWeight(800),
            fontSize = 30.sp,
            color = Color.White,

            )

        Text(
            text = "bank ComprovIA",
            modifier = Modifier
                .padding(top = 100.dp)
                .align(Alignment.Center),
            fontSize = 28.sp,
            fontWeight = FontWeight(400),
            color = Color.White
        )


            Button(
                onClick = { onNavigate()
                   },
                modifier = Modifier
                    .padding(16.dp)
                    .height(48.dp)
                    .width(287.dp)
                    .align(Alignment.BottomCenter),
                colors = ButtonDefaults.buttonColors(Color.Transparent.copy(alpha = 0.2f)),
                border = BorderStroke(2.dp, Color.Black),
                shape = RoundedCornerShape(8.dp)


            ) {
                Text(text = "Entrar na minha conta ")
            }
        }


    }


@Composable

fun GreetingPreview() {
    Korpay_tela_loginTheme {
        Login ()

    }
}



