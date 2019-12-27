package com.android.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrencyModel(val success :Boolean,
                         val message : String,
                         val result : ArrayList<CurrencyDetailsModel>):Parcelable