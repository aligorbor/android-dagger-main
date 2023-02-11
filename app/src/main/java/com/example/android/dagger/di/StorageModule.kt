package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

//@Module
//abstract class StorageModule {
//    @Binds
//    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
//}

@Module
class StorageModule {
    @Provides
     fun provideStorage(context: Context): Storage{
         return SharedPreferencesStorage(context)
     }
}