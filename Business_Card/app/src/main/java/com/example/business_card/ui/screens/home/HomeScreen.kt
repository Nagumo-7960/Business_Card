package com.example.business_card.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
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

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    top = 130.dp
                )
        ) {
            AndroidIcon()
            FullNameCard()
            TitleCard()
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    top = 100.dp,
                    bottom = 50.dp
                )
        ) {
            Column (){
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 50.dp
                        )
                        ){
                    PhoneImageCard()
                    PhoneNumberCard()
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 50.dp
                        )
                        ){
                    MediaHandleCard()
                    MediaIdCard()
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 50.dp
                        )
                        ){
                    MailImageCard()
                    MailNumberCard()
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
            .fillMaxWidth()
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
fun PhoneImageCard() {
    Icon(
        imageVector = Icons.Filled.Phone,
        contentDescription = "phone",
        modifier = Modifier
            .padding(
                start = 50.dp,
                end = 20.dp
            )
            .size(30.dp)
    )
}

@Composable
fun PhoneNumberCard(){
    Text(
        fontSize = 20.sp,
        text = "+11(123)444 555 666"
    )
}

@Composable
fun MediaHandleCard() {
    Icon(
        modifier = Modifier
            .padding(
                start = 50.dp,
                end = 20.dp
            )
            .size(30.dp),
        imageVector = Icons.Filled.Share,
        contentDescription = "media_handle"
    )
}

@Composable
fun MediaIdCard(){
    Text(
        fontSize = 20.sp,
        text = "@socialmediahandle"
    )
}
@Composable
fun MailImageCard() {
    Icon(
        modifier = Modifier
            .padding(
                start = 50.dp,
                end = 20.dp
            )
            .size(30.dp),
        imageVector = Icons.Filled.Email,
        contentDescription = "mail"
    )
}

@Composable
fun MailNumberCard(){
    Text(
        fontSize = 20.sp,
        text = "jen.doe@android.com"
    )
}

@Preview
@Composable
fun PreviewHome() {
    val navController = rememberNavController()
    HomeScreen(navController)
}