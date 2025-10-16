package com.filippo.koinplayground.di

import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module
import org.koin.core.annotation.Named

@Module
@Configuration
class AppModule {

    @Named("AppString")
    @Factory
    fun provideSomeString() = "App string"
}
