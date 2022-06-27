package com.dave.validations

import android.content.Context
import android.text.TextUtils
import android.widget.EditText

class EditTextValidation {

    /**
     * Add the edit texts as follows
     * val validatelist = mutableListOf(yourname, youremail, yourconfirmpassword, yourpassword, yourschool)
     *         if (validated(validatelist)) {
     *          val (name, email, password, confirmpassword, school) = validatelist.map { mytext(it) }
     *          val countyid = countyid(myViewModel(this),county)
     *          val agentid = getagentid(myViewModel(this), agent)
     *          createUser(name, email, password, confirmpassword, countyid, school, agentid)
     *         }
     */

    fun Context.validated(editTextList: MutableList<EditText>): Boolean {
        editTextList.forEach {
            val edittext = it
            if (TextUtils.isEmpty(edittext.text.toString())) {
                edittext.error = "You cannot leave this field blank"
                return false
            }
        }
        return true
    }



    fun Context.mytext(edittext: EditText): String {
        return edittext.text.toString().trim()
    }
}