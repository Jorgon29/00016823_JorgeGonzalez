package com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantsList

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdmtaller2.a00016823_jorgegonzalez.R
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant, navigate: (id: Int) -> Unit){
        Column(
            modifier = Modifier
                .background(Color.Transparent)
                .clickable {
                    navigate(restaurant.id)
                }
        ) {
            Text( text = restaurant.name)
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name + " " + restaurant.description,
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                placeholder = painterResource(R.drawable.placeholder),
                error = painterResource(R.drawable.error_image)
            )
        }


}