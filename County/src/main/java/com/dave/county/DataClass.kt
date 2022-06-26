package com.dave.county

data class DbCounty(
    val name: String,
    val capital: String,
    val code: String,
    val sub_counties: List<String>
)

data class DbCountyData(
    val name: String,
    val code: String
)