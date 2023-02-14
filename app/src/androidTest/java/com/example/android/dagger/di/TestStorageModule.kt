package com.example.android.dagger.di

import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn


@TestInstallIn(
components = [SingletonComponent::class],
    replaces = [StorageModule::class]
)
@Module
abstract class TestStorageModule{
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}