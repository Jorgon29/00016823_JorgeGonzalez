package com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantview

import androidx.compose.foundation.Image
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.composables.icons.lucide.ChevronLeft
import com.composables.icons.lucide.Lucide

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantTopBar(title: String, goBack: () -> Unit){
    CenterAlignedTopAppBar(
        title = {Text( text = title)},
        navigationIcon = {
                         IconButton(
                             onClick = { goBack() }
                         ) {
                             Image(Lucide.ChevronLeft, "Back arrow")
                         }
                         },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            titleContentColor = MaterialTheme.colorScheme.tertiary
        )
    )
}