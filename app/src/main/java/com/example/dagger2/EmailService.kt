package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService{

    fun send(to : String, from : String, body : String)
}

class EmailService @Inject constructor() : NotificationService{

    override fun send(to : String, from : String, body : String){
        Log.d("daggerLog", "email sent to $to from $from with message - $body")
    }
}

class MessageService(private val retryCount :Int) : NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("daggerLog", "message sent to $to from $from with message - $body . Rety count is $retryCount")
    }

}