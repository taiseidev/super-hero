package com.example.superhero

import SuperheroesTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.superhero.model.Hero

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    HeroItem(
                        hero = Hero(
                            nameRes = R.string.hero1,
                            descriptionRes = R.string.description1,
                            imageRes = R.drawable.android_superhero1
                        )
                    )
                }
            }
        }
    }
}
