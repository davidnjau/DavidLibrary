package com.dave.county

import android.content.Context
import java.io.IOException
import java.io.InputStream

object Utils {

  fun getJsonFromAssets(context: Context): String? {
    val jsonString: String = try {

      val countyJson = "county.json"

      val `is`: InputStream = context.assets.open(countyJson)
      val size: Int = `is`.available()
      val buffer = ByteArray(size)
      `is`.read(buffer)
      `is`.close()
      String(buffer, "UTF-8")
    } catch (e: IOException) {
      e.printStackTrace()
      return null
    }
    return jsonString
  }

}