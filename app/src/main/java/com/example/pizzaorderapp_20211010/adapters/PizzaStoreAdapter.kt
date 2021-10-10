package com.example.pizzaorderapp_20211010.adapters

import android.widget.ArrayAdapter
import com.example.pizzaorderapp_20211010.datas.StoreData
import java.math.MathContext

class PizzaStoreAdapter(
    val mContext: MathContext,
    val resId : Int,
    val mList : ArrayList<StoreData>


) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}