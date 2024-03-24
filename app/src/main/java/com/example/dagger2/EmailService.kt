package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun sendEmail(to : String, from : String, body : String){
        Log.d("daggerLog", "email sent to $to from $from with message - $body")
    }
}