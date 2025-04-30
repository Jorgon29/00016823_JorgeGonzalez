package com.pdmtaller2.a00016823_jorgegonzalez.views.restaurantview

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdmtaller2.a00016823_jorgegonzalez.R
import com.pdmtaller2.a00016823_jorgegonzalez.model.Dish

@Composable
fun DishCard(dish: Dish){
    val toast = Toast.makeText(LocalContext.current, dish.name + " " + stringResource(R.string.added_to_cart), Toast.LENGTH_SHORT)
    Column(
        modifier = Modifier
            .width(250.dp)
            .background(MaterialTheme.colorScheme.secondary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text( text = dish.name, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text( text = dish.description)
        AsyncImage(
            model = dish.imageUrl,
            contentDescription = dish.name + " " + dish.description,
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
            placeholder = painterResource(R.drawable.placeholder),
            error = painterResource(R.drawable.error_image)
        )
        Button(
            onClick = {
                toast.show()
            },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary, contentColor = MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            Text(stringResource(R.string.add_to_card))
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}