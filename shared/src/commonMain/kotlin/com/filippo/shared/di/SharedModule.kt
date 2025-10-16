package com.filippo.shared.di

import jakarta.inject.Named
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
@Configuration
class SharedModule {

    @Named("SharedString")
    @Factory
    fun sharedString() = "Shared string"
}
