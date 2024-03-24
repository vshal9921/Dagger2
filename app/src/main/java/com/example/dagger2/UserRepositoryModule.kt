package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getDbRepository(dbRepository: DbRepository) : UserRepository {
        return dbRepository
    }
}