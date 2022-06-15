package com.example.business_card.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.business_card.R
import com.example.business_card.ui.components.MailCard
import com.example.business_card.ui.components.MediaCard
import com.example.business_card.ui.components.PhoneCard

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 10.dp,
                end = 10.dp
            ),

                horizontalAlignment = Alignment . End
    ) {
        SettingIcon(navController)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    top = 130.dp
                )
                .fillMaxWidth()
        ) {
            AndroidIcon()
            FullNameCard()
            TitleCard()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    top = 200.dp,
                    bottom = 50.dp
                )
                .fillMaxSize()
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 50.dp
                        )
                ) {
                    PhoneCard()
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 50.dp
                        )
                ) {
                    MediaCard()
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 50.dp
                        )
                ) {
                    MailCard()
                }
            }
            Column {

            }
            Column {

            }
        }
    }
}

@Composable
fun AndroidIcon() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = "android_icon",
        modifier = Modifier
            .height(120.dp)
    )
}

@Composable
fun FullNameCard() {
    Text(
        text = "Jennifer Doe",
        fontSize = 50.sp
    )
}

@Composable
fun TitleCard() {
    Text(
        text = "Android Developer Extraordinaire",
        fontSize = 18.sp
    )
}



@Composable
fun SettingIcon(navController: NavController) {
    Icon(
        modifier = Modifier
            .size(
                width = 30.dp,
                height = 30.dp
            )
            .clickable(
                enabled = true,
                onClick = {
                    navController.navigate("settingScreen")

                }
            ),
        imageVector = Icons.Filled.Settings,
        contentDescription = "settings"
    )
}

@Preview
@Composable
fun PreviewHome() {
    val navController = rememberNavController()
    HomeScreen(navController)
}