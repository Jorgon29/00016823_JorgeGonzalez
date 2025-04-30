package com.pdmtaller2.a00016823_jorgegonzalez.views.generalsearch
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant
import com.pdmtaller2.a00016823_jorgegonzalez.viewModels.GeneralSearchViewModel
import com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantsList.RestaurantCard
import com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantview.RestaurantSearchBar

@Composable
fun GeneralSearch(navigate: (id: Int) -> Unit){
    val viewModel = GeneralSearchViewModel()
    var searchText by rememberSaveable { mutableStateOf("") }
    val allRestaurants = viewModel.restaurantsP.collectAsState()
    var filteredRestaurants by rememberSaveable { mutableStateOf<List<Restaurant>>(emptyList())}

    fun filter(query: String) {
        filteredRestaurants = allRestaurants.value.filter { restaurant ->
            val matchesCategory = restaurant.categories.any { category ->
                category.contains(query, ignoreCase = true)
            }
            val matchesDishName = restaurant.menu.any { dish ->
                dish.name.contains(query, ignoreCase = true)
            }
            val matchesName = restaurant.name.contains(query, ignoreCase = true)
            matchesCategory || matchesDishName || matchesName
        }
    }
    fun changeText(newText: String){
        searchText = newText
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        RestaurantSearchBar(searchText, filter = {filter(searchText)}, modifier = Modifier, changeText = {newText -> changeText(newText)})
        Spacer(modifier = Modifier.height(24.dp))
        LazyColumn {
            items(filteredRestaurants){
                restaurant ->
                RestaurantCard(restaurant, navigate = navigate)
            }
        }
    }
}