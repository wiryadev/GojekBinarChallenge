package com.wiryadev.gojekclone.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wiryadev.gojekclone.data.MainService
import com.wiryadev.gojekclone.R
import com.wiryadev.gojekclone.data.Promo

class HomeViewModel : ViewModel() {

    private val _mainServices = MutableLiveData<List<MainService>>().apply {
        value = getMainService()
    }
    val mainServices: LiveData<List<MainService>> = _mainServices

    private val _quickAccess = MutableLiveData<List<MainService>>().apply {
        value = getQuickAccess()
    }
    val quickAccess: LiveData<List<MainService>> = _quickAccess

    private val _promos = MutableLiveData<List<Promo>>().apply {
        value = getPromos()
    }

    val promos: LiveData<List<Promo>> = _promos

    private fun getMainService(): List<MainService> {
        return listOf(
            MainService("GoRide", R.drawable.ic_go_ride),
            MainService("GoCar", R.drawable.ic_go_car),
            MainService("GoFood", R.drawable.ic_go_food),
            MainService("GoSend", R.drawable.ic_go_send),
            MainService("GoMart", R.drawable.ic_go_mart),
            MainService("GoPulsa", R.drawable.ic_go_pulsa),
            MainService("Check In", R.drawable.ic_go_check_in),
            MainService("More", R.drawable.ic_go_more),
        )
    }

    private fun getQuickAccess(): List<MainService> {
        return listOf(
            MainService("Ada voucher nganggur nih", R.drawable.ic_payments_24_voucher_horizontal),
            MainService("Restoran terdekat", R.drawable.ic_chat_product_gofood),
        )
    }

    private fun getPromos(): List<Promo> {
        return listOf(
            Promo(R.drawable.promo_1, "Promo Burger King: Cashback 50%", "Yuk buruan dateng ke Burger King mumpung ada Promo Burger King yang bakal kasih kamu cashback kalo transaksi pakai GoPay."),
            Promo(R.drawable.promo_2, "Bonus Kuota 4GB untuk Pembelian Paket OMG", "Nikmati promo Telkomsel sekarang kalau isi paket data di GoTagihan/GoPulsa bisa dapet bonus tambahan!")
        )
    }
}