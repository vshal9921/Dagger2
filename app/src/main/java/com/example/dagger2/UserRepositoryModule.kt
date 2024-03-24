package com.example.dagger2

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getDbRepository(dbRepository: DbRepository) : UserRepository
}