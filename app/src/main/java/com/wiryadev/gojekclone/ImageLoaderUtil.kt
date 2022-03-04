package com.wiryadev.gojekclone

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(data: Any) {
    Glide.with(this.context)
        .load(data)
        .into(this)
}