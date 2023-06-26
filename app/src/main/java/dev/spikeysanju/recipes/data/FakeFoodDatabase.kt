
package dev.spikeysanju.recipes.data



import dev.spikeysanju.recipes.model.Food

import dev.spikeysanju.wiggles.R


object FakeFoodDatabase {
    val foodList = listOf(
        Food(
            0,
            "StrawBerry Cake",
            "Dessert",
            "45 minutes",
            "620 kcal",
            "4.9",
            "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.",
            R.drawable.strawberrycake,
            "30 comments",
            "Flour,Eggs,Salt,Yeast"

        ),
        Food(
            1,
            "Meatballs",
            "Meat",
            "30 Minutes",
            "400 kcal",
            "4.0",
            "This is a lovely dish of rounded meat which can be taken with anything",
            R.drawable.meatballs,
            "200 comments",
            "Meat,Eggs,Salt,Onions" ,
        ),
        Food(
            2,
            "Four Seasons Pizza",
            "Pizza",
            "30 minutes",
            "500 kcal",
            "5.0",
            "This is a pizza which includes all flavours which can be fused.It is one of the classics",
            R.drawable.pizza,
            "20 comments",
            "Flour,Eggs,Salt,Yeast,Olives,Cheese"

        ),
        Food(
            3,
            "Pasta",
            "Main Course",
            "60 minutes",
            "900 kcal",
            "3.5",
            "This is a famous Italian dish which is made wholesome.It is usually taken" +
                    "as a main course with an accompaniment",
            R.drawable.pasta,
            "76 comments",
            "Potatoes,Flour,Yeast,Eggs"
        ),
    )
}
