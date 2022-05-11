package com.example.business_card.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.business_card.R

@Composable
fun HomeScreen(navController: NavController) {
    Column() {
        AndroidIcon()
        Row() {

        }
    }
}

@Composable
fun AndroidIcon(){
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = "android_icon",
    )
}

@Preview
@Composable
fun PreviewHome(){
    val navController = rememberNavController()
    HomeScreen(navController)
}