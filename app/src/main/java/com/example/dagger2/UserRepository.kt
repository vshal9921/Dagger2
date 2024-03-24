package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){

    fun saveUser(email : String, password : String){
        Log.d("daggerLog", "user saved in db")
    }



}