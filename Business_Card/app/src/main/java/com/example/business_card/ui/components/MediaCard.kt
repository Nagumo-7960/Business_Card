package com.example.business_card.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MediaCard() {
    Row(
        modifier = Modifier
            .padding(
                top = 20.dp,
                end = 10.dp
            )
    ) {
        MediaImageCard()
        MediaIdCard()
    }
}

@Composable
fun MediaImageCard() {
    Icon(
        modifier = Modifier
            .size(30.dp),
        imageVector = Icons.Filled.Share,
        contentDescription = "media_handle"
    )
}

@Composable
fun MediaIdCard() {
    Text(
        modifier = Modifier.padding(
            start = 20.dp
        ),
        fontSize = 20.sp,
        text = "@socialmediahandle"
    )
}