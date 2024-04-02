package com.example.dagger2

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageAnnotation private val notificationService: NotificationService) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "admin@gmail.com", "user registered successfully")
    }
}