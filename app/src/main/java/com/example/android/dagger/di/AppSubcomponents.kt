package com.example.android.dagger.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(subcomponents = [
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class])
class  AppSubcomponents