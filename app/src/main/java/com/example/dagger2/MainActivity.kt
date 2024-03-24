package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting component from dagger
        val component = DaggerUserRegistrationComponent.builder().build();

        // getting objects of class required through dagger
        val userRegistrationService = component.getUserRegistrationService()

        userRegistrationService.registerUser("abc@gmail.com", "123")

    }
}