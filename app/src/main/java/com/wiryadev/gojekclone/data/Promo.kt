package com.wiryadev.gojekclone.data

import androidx.annotation.DrawableRes

data class Promo(
    @DrawableRes val image: Int,
    val title: String,
    val desc: String,
)
