package com.example.pixaranimation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimationClass(
    val animationimg: Int,
    val animationname: String,
    val animationdate: String,
    val animationdirector: String,
    val animationdesc: String,
    val animationrate: String,
    val ratingbar: Double
) : Parcelable