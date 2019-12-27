package com.android.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.myapplication.R
import com.android.myapplication.model.CurrencyDetailsModel
import kotlinx.android.synthetic.main.item_currency_list.view.*

var currencyDataList = mutableListOf<CurrencyDetailsModel>()
class CurrencyListAdapter: RecyclerView.Adapter<CurrencyListAdapter.CurrencyInfoVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CurrencyInfoVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_currency_list,parent,false)
        return CurrencyInfoVH(view)
    }

    override fun getItemCount() = currencyDataList.size

    override fun onBindViewHolder(holder: CurrencyInfoVH, position: Int) {
        holder.itemView.currencyShortText.text = currencyDataList[position].Currency
        holder.itemView.currencyLongText.text = currencyDataList[position].CurrencyLong
        holder.itemView.currencyTxnValue.text = currencyDataList[position].TxFee.toString()
    }
    class CurrencyInfoVH(view: View) : RecyclerView.ViewHolder(view)

    fun updateDataList(newCurrencyDataList : ArrayList<CurrencyDetailsModel>){
        currencyDataList = newCurrencyDataList
        notifyDataSetChanged()
    }
}