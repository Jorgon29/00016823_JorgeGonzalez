package com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantsList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.a00016823_jorgegonzalez.viewModels.RestaurantsListViewModel

@Composable
fun RestaurantsList(onRestaurantClick: (id: Int) -> Unit){
    val viewModel = RestaurantsListViewModel()
    val categories = viewModel.categories.collectAsState()
    val restaurants = viewModel.restaurantsP.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        categories.value.forEach { category ->
            Column(
            ) {
                Text(category)
                Spacer(modifier = Modifier.height(16.dp))
                LazyRow(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                ) {
                    items(restaurants.value) { restaurant ->
                        if(category in restaurant.categories){
                            RestaurantCard(restaurant, onRestaurantClick)
                        }
                    }
                }
            }


        }
    }
}