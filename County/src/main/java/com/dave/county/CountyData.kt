package com.dave.county

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CountyData {


    fun getCountyData(context: Context): List<DbCounty> {

        val jsonFileString = Utils.getJsonFromAssets(context)
        val gson = Gson()
        val listUserType = object : TypeToken<List<DbCounty?>?>() {}.type
        return gson.fromJson(jsonFileString, listUserType)

    }

}