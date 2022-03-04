package com.wiryadev.gojekclone

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes

data class MainService(
    val name: String,
    @DrawableRes val image: Int,
    @ColorRes val colorTint: Int,
)
