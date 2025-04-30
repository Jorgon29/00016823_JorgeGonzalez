package com.pdmtaller2.a00016823_jorgegonzalez.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.composables.icons.lucide.CalendarDays
import com.composables.icons.lucide.House
import com.composables.icons.lucide.Lucide
import com.composables.icons.lucide.Search
import com.pdmtaller2.a00016823_jorgegonzalez.screens.GeneralSearchNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.MyOrdersNavigation
import com.pdmtaller2.a00016823_jorgegonzalez.screens.RestaurantListNavigation

@Composable
fun CustomNavBar(navController: NavController){

    val navItems = listOf(
        NavItem(
            "home",
            RestaurantListNavigation,
            Lucide.House
        ),
        NavItem(
            "search",
            GeneralSearchNavigation,
            Lucide.Search
        ),
        NavItem(
            "history",
            MyOrdersNavigation,
            Lucide.CalendarDays
        )
    )

    NavigationBar(
        modifier = Modifier.fillMaxWidth()
    ) {
       navItems.forEach { item ->
           Button(
               onClick = {
                   navController.navigate(item.address)
               },
               modifier = Modifier.background(Color.Transparent).weight(1f),

           ) {
                Image(
                    imageVector = item.icon,
                    contentDescription = item.label
                )
           }

       }
    }

}