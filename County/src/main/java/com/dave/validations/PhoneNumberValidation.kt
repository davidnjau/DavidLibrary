package com.dave.validations

class PhoneNumberValidation {

    fun getStandardPhoneNumber(number: String):String?{

        return if (number.length > 8){
            val input1 = StringBuilder()
            input1.append(number)
            val reversedString = input1.reverse()
            val newReversedString = reversedString.substring(0, 9)

            val stringBuilder = StringBuilder()
            stringBuilder.append(newReversedString)
            val newString = stringBuilder.reverse()
            val newPhone = checkNumber("+254$newString")
            newPhone

        }else{
            null
        }


    }

    private fun checkNumber(phone: String):String?{

        val phoneNoSpace = phone.replace("\\s".toRegex(), "")

        //Calculate how long is the phone number
        val phoneLength = phoneNoSpace.length

        //Check if number starts with 7 or 1

        val fourthNoCheck = phoneNoSpace[4].toString()
        return if (isNumeric(fourthNoCheck)){
            val fourthNo = fourthNoCheck.toInt()
            if (fourthNo == 7 || fourthNo == 1 ){
                if (phoneLength == 13 && checkDash(phoneNoSpace)){
                    phone
                }else{
                    null
                }
            }else{
                null
            }
        }else{
            null
        }

    }

    private fun isNumeric(toCheck: String): Boolean {
        return toCheck.all { char -> char.isDigit() }
    }

    private fun checkDash(str: String):Boolean{
        return !str.contains("-")
    }

}