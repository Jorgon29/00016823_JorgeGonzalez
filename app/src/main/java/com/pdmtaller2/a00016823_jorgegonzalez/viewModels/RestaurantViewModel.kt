package com.pdmtaller2.a00016823_jorgegonzalez.viewModels

import androidx.lifecycle.ViewModel
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant
import com.pdmtaller2.a00016823_jorgegonzalez.model.dummyData.restaurants
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RestaurantViewModel: ViewModel() {
    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant
    fun loadRestaurant(id: Int){
        val thisRestaurants = restaurants
        thisRestaurants.forEach { thisRestaurant ->
            if(thisRestaurant.id == id){
                _restaurant.value = thisRestaurant
            }
        }
    }
}