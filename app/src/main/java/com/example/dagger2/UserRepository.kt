package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    companion object {
        const val TAG = "Dagger"
    }

    fun saveUser(email : String, password : String){
        Log.d(Companion.TAG, "user saved in db")
    }



}