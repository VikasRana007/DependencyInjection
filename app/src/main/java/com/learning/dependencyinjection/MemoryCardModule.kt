package com.learning.dependencyinjection

import dagger.Module
import dagger.Provides

@Module                                         // using module annotation
class MemoryCardModule {
    @Provides                                   // using provides annotation otherwise dagger will not recognize it as a provider function
                                               // now link this module with SmartPhoneComponent interface
    fun provideMemoryCard():MemoryCard{
       return MemoryCard()
    }
}