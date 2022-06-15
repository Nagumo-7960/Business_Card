package com.example.business_card.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PhoneCard() {
    Row(
        modifier = Modifier
            .padding(
                top = 20.dp,
                end = 10.dp
            )
    ) {
        PhoneImageCard()
        PhoneNumberCard()
    }
}

@Composable
fun PhoneImageCard() {
    Icon(
        imageVector = Icons.Filled.Phone,
        contentDescription = "phone",
        modifier = Modifier
            .size(30.dp)
    )
}

@Composable
fun PhoneNumberCard() {
    Text(
        modifier = Modifier.padding(
            start = 20.dp
        ),
        fontSize = 20.sp,
        text = "+11(123)444 555 666"
    )
}