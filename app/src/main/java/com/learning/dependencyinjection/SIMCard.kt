package com.learning.dependencyinjection

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {

    init {
        Log.i("MYTAG","Connection Establishing")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
        Log.i("MYTAG","Connection Established")
    }
}