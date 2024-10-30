package com.example.oneweekfitness

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Exercise(
    @StringRes val titleId: Int,
    @DrawableRes val imageId: Int,
    @StringRes val descriptionId: Int
)
