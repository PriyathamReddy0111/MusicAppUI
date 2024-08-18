package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun Browse(){
    val categories = listOf("Hits","Happy","Workout","Running","TGIF","Yoga")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), content = {
            items(categories){
                category->
                Column {
                    Text(text = category, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
                    BrowserItem(cat = category, drawable = R.drawable.baseline_apps_24)
                }
            }
        }
    )
}