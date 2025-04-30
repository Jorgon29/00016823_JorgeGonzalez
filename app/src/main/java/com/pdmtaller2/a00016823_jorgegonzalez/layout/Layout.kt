package com.pdmtaller2.a00016823_jorgegonzalez.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.a00016823_jorgegonzalez.screens.GeneralSearchNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.MyOrdersNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.RestaurantListNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.RestaurantMenuNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.views.generalsearch.GeneralSearch
import com.pdmtaller2.a00016823_jorgegonzalez.views.MyOrders
import com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantsList.RestaurantsList
import com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantview.RestaurantView

@Composable
fun Layout(){
    val navController = rememberNavController()
    val onRestaurantClick = {
            restaurantId: Int ->
        navController.navigate(RestaurantMenuNavigation(restaurantId))
    }
    Scaffold(
        bottomBar = {CustomNavBar(navController)}
    ) {
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NavHost(
                navController = navController,
                startDestination = RestaurantListNavigation
            ) {
                composable<RestaurantListNavigation> {

                    RestaurantsList(onRestaurantClick)
                }

                composable<RestaurantMenuNavigation> {
                    RestaurantView(it.arguments?.getInt("id") ?: 1) { navController.popBackStack() }
                }

                composable<GeneralSearchNavigation> {
                    GeneralSearch(onRestaurantClick)
                }

                composable<MyOrdersNavigation> {
                    MyOrders()
                }
            }
        }
    }
}