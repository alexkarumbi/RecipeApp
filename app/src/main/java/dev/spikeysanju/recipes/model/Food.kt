
package dev.spikeysanju.recipes.model

data class Food(
    val id: Int,
    val title: String,
    val category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val image:Int,
    val reviews: String,
    val ingredients: String
)
