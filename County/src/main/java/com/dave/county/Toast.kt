package com.dave.county

import android.content.Context
import android.widget.Toast

class Toast {

    fun testToast(context: Context, s: String){
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show()
    }
}