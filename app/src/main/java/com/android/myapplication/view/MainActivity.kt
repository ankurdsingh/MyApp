package com.android.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.myapplication.R
import com.android.myapplication.viewmodel.CurrenyListVM
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter: CurrencyListAdapter = CurrencyListAdapter()
    private lateinit var viewModel: CurrenyListVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        viewModel = ViewModelProviders.of(this).get(CurrenyListVM::class.java)
        viewModel.fetchCurrenctInfo()
        currencyList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapter
        }
        observerList()
    }

    private fun observerList() {
        viewModel.currencyDataList.observe(this, Observer {  list->
            list?.let{
                adapter.updateDataList(list)
            }
        })
    }

}
