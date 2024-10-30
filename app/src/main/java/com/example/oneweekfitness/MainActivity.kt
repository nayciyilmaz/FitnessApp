package com.example.oneweekfitness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.oneweekfitness.ui.theme.OneWeekFitnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneWeekFitnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OneWeekApp()
                }
            }
        }
    }
}

@Composable
fun OneWeekApp() {
    Scaffold(
        topBar = { TopAppBar() }
    ) {
        val exerciseList = Exercises.exercises
        ExerciseList(exerciseList = exerciseList, contentPadding = it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
   androidx.compose.material3.TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun OneWeekAppPreview() {
    OneWeekFitnessTheme(darkTheme = false) {
        OneWeekApp()
    }
}

@Preview(showBackground = true)
@Composable
fun OneWeekAppDarkPreview() {
    OneWeekFitnessTheme(darkTheme = true) {
        OneWeekApp()
    }
}

