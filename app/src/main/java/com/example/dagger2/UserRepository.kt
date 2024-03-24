package com.example.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository{

    fun saveUser(email : String, password : String)
}

class DbRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d("daggerLog", "user saved in db")
    }
}
class FirebaseRepository : UserRepository{

    override fun saveUser(email : String, password : String){
        Log.d("daggerLog", "user saved in firebase")
    }
}