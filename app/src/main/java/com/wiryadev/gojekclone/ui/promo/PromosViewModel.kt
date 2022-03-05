package com.wiryadev.gojekclone.ui.promo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PromosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Promos Fragment"
    }
    val text: LiveData<String> = _text
}