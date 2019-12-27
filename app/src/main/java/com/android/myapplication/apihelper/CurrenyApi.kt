package com.android.myapplication.apihelper

import com.android.myapplication.model.CurrencyModel
import com.android.myapplication.utillity.GET_CURRENCY_API
import retrofit2.Call
import retrofit2.http.GET

interface CurrenyApi {
    @GET(GET_CURRENCY_API)
    fun getCurrencyData(): Call<CurrencyModel>
}