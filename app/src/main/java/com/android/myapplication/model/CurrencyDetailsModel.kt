package com.android.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrencyDetailsModel(val Currency: String,
                                val CurrencyLong: String,
                                val TxFee : Long) : Parcelable
