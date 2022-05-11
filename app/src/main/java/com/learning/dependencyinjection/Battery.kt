package com.learning.dependencyinjection

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.i("MYTAG", "Power Generated")
    }

    fun getPower() {
        Log.i("MYTAG", "Power Available")
    }
}