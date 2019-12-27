package com.android.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.myapplication.apihelper.APIClient
import com.android.myapplication.apihelper.CurrenyApi
import com.android.myapplication.model.CurrencyDetailsModel
import com.android.myapplication.model.CurrencyModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrenyListVM : ViewModel() {
    val currencyDataList = MutableLiveData<ArrayList<CurrencyDetailsModel>>()
    lateinit var currencyApi: CurrenyApi
    fun fetchCurrenctInfo(){
        currencyApi = APIClient.getClient().create(CurrenyApi::class.java)
        val c1 = CurrencyDetailsModel("abc","abcd",1)
        val c2 = CurrencyDetailsModel("abc","abcd",1)
        val c3 = CurrencyDetailsModel("abc","abcd",1)
        val list = arrayListOf<CurrencyDetailsModel>(c1,c2,c3)
        currencyDataList.value = list

        /*val call = currencyApi.getCurrencyData()
        call.enqueue(object : Callback<CurrencyModel>{
            override fun onFailure(call: Call<CurrencyModel>, t: Throwable) {

            }
            override fun onResponse(call: Call<CurrencyModel>, response: Response<CurrencyModel>) {
                if(response.code()== 200){
                    val currencyModel = response.body()
                    Log.d("TAG",response.body().toString())
                    if(currencyModel!=null && currencyModel.result.size>0)
                   currencyDataList.value = currencyModel.result
                }
            }

        })*/
    }
}