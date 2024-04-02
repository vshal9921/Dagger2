package com.example.dagger2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Named("email")
    @Provides
    fun getEmailService() : NotificationService{
        return EmailService()
    }

    @MessageAnnotation
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService()
    }
}