package com.learning.dependencyinjection

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor() {
init {
    Log.i("MYTAG","Spaced Card Constructed")
}
    fun getSpaceAvailability() {
        Log.i("MYTAG","Spaced Card Available")
    }
}