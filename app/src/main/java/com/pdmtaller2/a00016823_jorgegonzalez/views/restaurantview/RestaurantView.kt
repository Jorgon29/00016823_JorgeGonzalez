package com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmtaller2.a00016823_jorgegonzalez.model.Dish
import com.pdmtaller2.a00016823_jorgegonzalez.viewModels.RestaurantViewModel


@Composable
fun RestaurantView(id: Int = 1, goBack: ()->Unit) {
    val textFieldState = TextFieldState()
    var searchText by rememberSaveable { mutableStateOf("") }
    val viewModel: RestaurantViewModel = viewModel()
    var dishes by rememberSaveable { mutableStateOf<List<Dish>>(emptyList()) }
    val thisRestaurant by viewModel.restaurant.collectAsState()
    val modifier = Modifier

    LaunchedEffect(id) {
        viewModel.loadRestaurant(id)
    }

    LaunchedEffect(thisRestaurant) {
        thisRestaurant?.menu.let {
            dishes = thisRestaurant?.menu ?: emptyList()
        }
    }

    fun changeSearchText(newText: String){
        searchText = newText
    }


    fun filterDishes(query: String) {
        thisRestaurant?.menu?.let { fullMenu ->
            dishes = fullMenu.filter {
                it.name.contains(query, ignoreCase = true)
            }
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
    ) {
        val restaurant = thisRestaurant
        if (restaurant != null) {
            RestaurantTopBar(restaurant.name, goBack)
            Spacer(modifier = Modifier.height(16.dp))
            Text( text = restaurant.description)
            Spacer(modifier = Modifier.height(16.dp))
            RestaurantSearchBar(searchText, filter = {filterDishes(searchText)}, modifier, changeText = { newText -> changeSearchText(newText)})
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(dishes.toList()) { dish ->
                    DishCard(dish)
                }
            }

        }

    }
}