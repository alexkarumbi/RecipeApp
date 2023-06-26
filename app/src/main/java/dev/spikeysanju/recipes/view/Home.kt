
package dev.spikeysanju.recipes.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.spikeysanju.recipes.component.ItemFoodCard
import dev.spikeysanju.recipes.component.TopBar
import dev.spikeysanju.recipes.model.Food

@Composable
fun Home(navController: NavHostController, foodList: List<Food>, toggleTheme: () -> Unit) {
    LazyColumn {
        item {
            TopBar(
                onToggle = {
                    toggleTheme()
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(foodList) {
            foodList.forEach {
                ItemFoodCard(
                    it,
                    onItemClicked = { food ->
                        navController.navigate("details/${food.id}/${food.title}/${food.category}")
                    }
                )
            }
        }
    }
}
