package com.wiryadev.gojekclone.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wiryadev.gojekclone.MainService
import com.wiryadev.gojekclone.R

class HomeViewModel : ViewModel() {

    private val _mainServices = MutableLiveData<List<MainService>>().apply {
        value = getMainService()
    }
    val mainServices: LiveData<List<MainService>> = _mainServices

    private fun getMainService(): List<MainService> {
        return listOf(
            MainService("GoRide", R.drawable.ic_round_sports_motorsports_24, R.color.green_500),
            MainService("GoCar", R.drawable.ic_round_directions_car_24, R.color.green_500),
            MainService("GoFood", R.drawable.ic_round_restaurant_24, R.color.red_500),
            MainService("GoSend", R.drawable.ic_round_space_dashboard_24, R.color.green_500),
            MainService("GoMart", R.drawable.ic_round_shopping_cart_24, R.color.red_500),
            MainService("GoPulsa", R.drawable.ic_round_charging_station_24, R.color.teal_200),
            MainService("Check In", R.drawable.ic_round_family_restroom_24, R.color.teal_200),
            MainService("More", R.drawable.ic_round_dashboard_24, R.color.grey_200),
        )
    }
}