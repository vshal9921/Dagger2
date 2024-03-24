package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity(){

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting component from dagger
        val component = DaggerUserRegistrationComponent.builder().build();

        // getting objects of class required through dagger
        component.inject(this)

        userRegistrationService.registerUser("abc@gmail.com", "123")

    }
}