package com.pdmtaller2.a00016823_jorgegonzalez.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmtaller2.a00016823_jorgegonzalez.viewModels.RestaurantViewModel


@Composable
fun RestaurantView(id: Int) {
    val viewModel: RestaurantViewModel = viewModel()
    LaunchedEffect(id) {
        viewModel.loadRestaurant(id)
    }

    val thisRestaurant by viewModel.restaurant.collectAsState()

    Column {
        val restaurant = thisRestaurant
        if (restaurant != null) {
            Text(text = restaurant.name)

            LazyColumn {
                items(restaurant.menu) { dish ->

                }
            }
        }
    }
}
