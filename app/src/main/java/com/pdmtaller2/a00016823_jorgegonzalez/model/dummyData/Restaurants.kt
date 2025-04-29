package com.pdmtaller2.a00016823_jorgegonzalez.model.dummyData

import com.pdmtaller2.a00016823_jorgegonzalez.model.Dish
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant

val restaurantCategories = listOf(
    "Comida rapida", "Mexicana", "Italiana", "Saludable", "Postres y dulces", "Bebidas"
)

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza1",
        description = "Pizza1 description",
        imageUrl = "",
        categories = listOf("Pizza", "Italiana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza pepperoni",
                description = "Pizza pepporoni description",
                imageUrl = ""
            ),
            Dish(
                id = 2,
                name = "Pizza jamon",
                description = "Pizza jamon description",
                imageUrl = ""
            )
        ),
    ),
    Restaurant(
        id = 2,
        name = "Sushi1",
        description = "Sushi1 description",
        imageUrl = "",
        categories = listOf("Asiatica", "Saludable", "Bebidas"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Sushi1 plato",
                description = "sushi1 plato description",
                imageUrl = ""
            ),
            Dish(
                id = 4,
                name = "agua",
                description = "agua description",
                imageUrl = ""
            )
        ),
    ),
    Restaurant(
        id = 3,
        name = "tacos1",
        description = "tacos1 description",
        imageUrl = "",
        categories = listOf("Mexicana", "Postres y dulces", "Bebidas"),
        menu = listOf(
            Dish(
                id = 5,
                name = "tacos1 plato",
                description = "tacos1 plato description",
                imageUrl = ""
            ),
            Dish(
                id = 6,
                name = "agua-mex",
                description = "agua-mex description",
                imageUrl = ""
            )
        ),
    )

)