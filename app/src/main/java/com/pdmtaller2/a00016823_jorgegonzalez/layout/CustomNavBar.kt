package com.pdmtaller2.a00016823_jorgegonzalez.layout

import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.pdmtaller2.a00016823_jorgegonzalez.screens.GeneralSearchNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.MyOrdersNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.RestaurantListNavigation

@Composable
fun CustomNavBar(navController: NavController){

    val navItems = listOf(
        NavItem(
            "home",
            RestaurantListNavigation
        ),
        NavItem(
            "search",
            GeneralSearchNavigation
        ),
        NavItem(
            "history",
            MyOrdersNavigation
        )
    )

    NavigationBar() {
       navItems.forEach { item ->
           Button(
               onClick = {
                   navController.navigate(item.address)
               }
           ) {
               Text(
                   text = item.label
               )
           }

       }
    }

}