package com.example.oneweekfitness

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun ExerciseList(
    exerciseList: List<Exercise>,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding) {
        itemsIndexed(exerciseList) { index, navigate ->
            ExerciseCard(exercise = navigate, index = index)
        }
    }
}

@Composable
fun ExerciseCard(exercise: Exercise, modifier: Modifier = Modifier, index: Int) {
    var isTextVisible by remember { mutableStateOf(false) }

    Card(
        modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { isTextVisible = !isTextVisible },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Surface(color = Color(0xFF2196F3)) {
            Column(
                modifier
                    .padding(12.dp)
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessMedium
                        )
                    )
            ) {
                Text(
                    text = "Day : "+(index+1),
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = stringResource(id = exercise.titleId),
                    style = MaterialTheme.typography.titleLarge
                )
                Image(
                    painter = painterResource(id = exercise.imageId),
                    contentDescription = null,
                    modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(top = 10.dp, bottom = 10.dp)
                )
                if (isTextVisible) {
                    Text(
                        text = stringResource(id = exercise.descriptionId),
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
        }
    }
}