package com.example.korpay_tela_login.views.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.korpay_tela_login.R
import com.example.korpay_tela_login.ui.theme.AzulOceano


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Login() {

    val scrollState = rememberScrollState()


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
            .height(1000.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img_1), contentDescription = "null",
            alignment = Alignment.TopCenter,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "Korpay",
            modifier = Modifier.padding(top = 30.dp, start = 60.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight(800),
            color = Color.White,
        )
        Text(
            text = "bank ComprovIA",
            modifier = Modifier.padding(top = 65.dp, start = 60.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(100),
            color = Color.White,
        )

        Text(
            text = "Faça seu login",
            modifier = Modifier
                .padding(top = 300.dp, start = 100.dp),
            //.align(Alignment.Center),

            fontSize = 30.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
        )
        Text(
            text = "Preencha os campos para continuar",
            modifier = Modifier.padding(top = 350.dp, start = 80.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight(200),
            color = Color.LightGray,
        )

        val email = remember { mutableStateOf("") }
        val senha = remember { mutableStateOf("") }
        val isIconVisible = remember { mutableStateOf(true) }
        val textState = remember { mutableStateOf("") }
        if (isIconVisible.value) {

            TextField(
                label = "Email",
                trailingIcon = Icons.Default.Email,
                _refValue = email,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (350).dp)
                    .padding(40.dp)
                    .clickable {
                        textState.value = ""
                        isIconVisible.value = false
                    }
            )
            TextField(
                label = "Senha",
                trailingIcon = Icons.Default.Lock,
                _refValue = senha,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (450).dp)
                    .padding(40.dp)
                    .clickable {
                        textState.value = ""
                        isIconVisible.value = false
                    }
            )
        }

        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .padding(top = 16.dp)
                .offset(y = (580).dp, x = (60.dp))
                .height(48.dp)
                .width(287.dp),

            colors = ButtonDefaults.textButtonColors(containerColor = AzulOceano),
            shape = RoundedCornerShape(8.dp)

        ) {
            Text(text = "Acessar a minha conta ", color = Color.White)
        }
        Button(
            onClick = { },
            modifier = Modifier
                .offset(y = (660).dp, x = (120.dp)),
            colors = ButtonDefaults.textButtonColors(Color.Transparent)
        ) {
            Text(text = "Esqueci minha senha", color = AzulOceano)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun TextField(
    trailingIcon: ImageVector? = null,
    label: String,
    _refValue: MutableState<String>,
    onChange: (() -> Unit)? = null,
    modifier: Modifier
) {
    OutlinedTextField(
        value = _refValue.value,
        label = { Text(label) },
        singleLine = true,
        onValueChange = { x -> _refValue.value = x },
        modifier = modifier,
        trailingIcon = trailingIcon?.let { icon ->
            {

                Icon(
                    imageVector = icon, contentDescription = null,
                    modifier = Modifier
                        .offset(x = -10.dp)

                )

            }
        })
}
//
//.clickable {
//    textState.value = ""
//    isIconVisible.value = false
//}
