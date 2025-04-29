package com.pdmtaller2.a00016823_jorgegonzalez.viewModels

import androidx.lifecycle.ViewModel
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant
import com.pdmtaller2.a00016823_jorgegonzalez.model.dummyData.restaurantCategories
import com.pdmtaller2.a00016823_jorgegonzalez.model.dummyData.restaurants
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RestaurantsListViewModel: ViewModel() {
    private val _categories = MutableStateFlow(restaurantCategories)
    val categories: StateFlow<List<String>> = _categories
    private val _restaurants = MutableStateFlow(restaurants)
    val restaurantsP: StateFlow<List<Restaurant>> = _restaurants

}