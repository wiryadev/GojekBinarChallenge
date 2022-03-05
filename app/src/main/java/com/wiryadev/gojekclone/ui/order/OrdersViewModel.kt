package com.wiryadev.gojekclone.ui.order

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrdersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Orders Fragment"
    }
    val text: LiveData<String> = _text
}