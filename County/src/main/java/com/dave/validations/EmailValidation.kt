package com.dave.validations

import java.util.regex.Pattern

class EmailValidation {

    fun isEmailValid(emailAddress: String):Boolean{

        val emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$"
        val pat = Pattern.compile(emailRegex)
        return pat.matcher(emailAddress).matches()
    }

}