package com.pdmtaller2.a00016823_jorgegonzalez.model.dummyData

import com.pdmtaller2.a00016823_jorgegonzalez.model.Dish
import com.pdmtaller2.a00016823_jorgegonzalez.model.Restaurant

val restaurantCategories = listOf(
    "Comida rapida", "Mexicana", "Italiana", "Saludable", "Postres y dulces", "Bebidas"
)

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "La cocina de Pirlo",
        description = "Comida italiana de la vecchia signora, forza juve!",
        imageUrl = "https://www.kingarthurbaking.com/sites/default/files/2023-03/Tiramisu_1426.jpg",
        categories = listOf("Italiana", "Saludable", "Bebidas"),
        menu = listOf(
            Dish(1, "Ravioli", "Ravioles rellenos de ricotta y espinaca con salsa de tomate.", "https://www.sunglowkitchen.com/wp-content/uploads/2022/09/ravioli-pomodoro-10.jpg"),
            Dish(2, "Tiramisú", "Postre frío con café, mascarpone y cacao.", "https://www.kingarthurbaking.com/sites/default/files/2023-03/Tiramisu_1426.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizzas Bendición de Dios",
        description = "Pizza evangélica",
        imageUrl = "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/4F1526F0-0A46-4C87-A3D5-E80AD76C0D70/Derivates/df9a8be7-6ab2-4d5a-8c4d-6cbe8aceda72.jpg",
        categories = listOf("Italiana", "Comida rapida"),
        menu = listOf(
            Dish(3, "Pizza Margarita", "Salsa de tomate, mozzarella fresca y albahaca.", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/4F1526F0-0A46-4C87-A3D5-E80AD76C0D70/Derivates/df9a8be7-6ab2-4d5a-8c4d-6cbe8aceda72.jpg"),
            Dish(4, "Calzone(s)", "Pizza doblada con jamón, champiñones y ricotta.", "https://www.hola.com/horizon/landscape/fd2640c1a6c5-portada-calzone-gtres-t.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Laca-Loca",
        description = "Tacos gentrificados",
        imageUrl = "https://i.insider.com/6091716b34af8d001859ad4f?width=700",
        categories = listOf("Mexicana", "Comida rapida", "Bebidas"),
        menu = listOf(
            Dish(5, "Taco al pasteur", "Cerdo marinado con piña y salsa verde.", "https://i.insider.com/6091716b34af8d001859ad4f?width=700"),
            Dish(6, "Agua de horchata++ ultra max", "Bebida refrescante de arroz con canela.", "https://ultimahora.sv/wp-content/uploads/2017/02/agua-sucia2.jpg")
        )
    ),
    Restaurant(
        id = 4,
        name = "El pirata de Culiacán",
        description = "Cocina mexicana desde el cielo",
        imageUrl = "https://editorialtelevisa.brightspotcdn.com/dims4/default/d51ff67/2147483647/strip/true/crop/672x672+264+0/resize/1000x1000!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.us-east-1.amazonaws.com%2Fbrightspot%2F6c%2F26%2Ff2c8fb3848c799a33f4dd014cd5a%2Fensalada-de-nopales-con-cebolla-receta-facil-y-rapida.jpeg",
        categories = listOf("Mexicana", "Postres y dulces", "Saludable"),
        menu = listOf(
            Dish(7, "Ensalada de nopales", "Nopales frescos con tomate, cebolla y queso fresco.", "https://editorialtelevisa.brightspotcdn.com/dims4/default/d51ff67/2147483647/strip/true/crop/672x672+264+0/resize/1000x1000!/quality/90/?url=https%3A%2F%2Fk2-prod-editorial-televisa.s3.us-east-1.amazonaws.com%2Fbrightspot%2F6c%2F26%2Ff2c8fb3848c799a33f4dd014cd5a%2Fensalada-de-nopales-con-cebolla-receta-facil-y-rapida.jpeg"),
            Dish(8, "Flan de cajeta", "Postre cremoso con dulce de leche de cabra.", "https://www.cocinadelirante.com/sites/default/files/images/2023/11/receta-de-flan-de-cajeta.jpg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Hamburguesas 505",
        description = "Hamburguesas estilo Managua",
        imageUrl = "https://www.cnnbrasil.com.br/viagemegastronomia/wp-content/uploads/sites/5/2022/05/mafe-estudio-LV2p9Utbkbw-unsplash.jpg",
        categories = listOf("Comida rapida", "Bebidas"),
        menu = listOf(
            Dish(9, "Burger doble quesillo", "Carne a la parrilla con queso doble y salsa secreta.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuQXkkvgLKga7Qq6FGBhx1JnwOoC75LTb98Q&s"),
            Dish(10, "Malteada de Nagarote", "Batido espeso de helado con leche fresca.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7YUQwUvdzTkMWf-hTCO7an_ANoY52ks_rhQ&s")
        )
    ),
    Restaurant(
        id = 6,
        name = "Los chorros vegetarianos",
        description = "Se sobrevive, o no",
        imageUrl = "https://comedera.com/wp-content/uploads/sites/9/2021/01/vegetable-skewer-3317060_1280.jpg?resize=1200,675&quality=80",
        categories = listOf("Saludable", "Bebidas"),
        menu = listOf(
            Dish(11, "La 201", "Con aguacate, garbanzos y aderezo de limón.", "https://comedera.com/wp-content/uploads/sites/9/2021/01/vegetable-skewer-3317060_1280.jpg?resize=1200,675&quality=80"),
            Dish(12, "La 202", "Espinaca, manzana, pepino y jengibre.", "https://img.freepik.com/fotos-premium/manzana-canela-jengibre-aislado-blanco_290431-3229.jpg")
        )
    ),
    Restaurant(
        id = 7,
        name = "PanPan",
        description = "Reposterías de la turba roja",
        imageUrl = "https://cdn0.recetasgratis.net/es/posts/4/1/8/cheesecake_con_fresas_23814_orig.jpg",
        categories = listOf("Postres y dulces"),
        menu = listOf(
            Dish(13, "Cheesecake Quiteño", "Suave y tropical.", "https://cdn0.recetasgratis.net/es/posts/4/1/8/cheesecake_con_fresas_23814_orig.jpg"),
            Dish(14, "Brownie 3 veces perfecto", "Con nueces tostadas y caramelo.", "https://cdn.blogsthermomix.es/media/Posts/attachments/2b44f5ef4e8c2c0577defbbbe3157cc6.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "La Barra de Don Abelino",
        description = "Bebidas con agua de la laguna de alegría",
        imageUrl = "https://img-global.cpcdn.com/recipes/recipes_28511_v1393348643_receta_foto_00028511/680x482cq70/refresco-de-te-verde-limonada-y-naranja-foto-principal.jpg",
        categories = listOf("Bebidas", "Saludable"),
        menu = listOf(
            Dish(15, "Limonada aguilucha", "Refrescante y natural.", "https://img-global.cpcdn.com/recipes/recipes_28511_v1393348643_receta_foto_00028511/680x482cq70/refresco-de-te-verde-limonada-y-naranja-foto-principal.jpg"),
            Dish(16, "Té jelado", "Infusión fría con frutas.", "https://www.pamperedchef.com/iceberg/com/recipe/2181024-lg.jpg")
        )
    )
)
