package com.learning.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides

//@Module
//class NCBatteryModule {
//    @Provides
//    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery {     //     because nc battery class already created the constructor of battery
//        return nickelCadmiumBattery
//    }

    // dagger will recognise this dependency as a battery

    //    we can also write the above code as below
    @Module
    abstract class NCBatteryModule {
        @Binds
        abstract fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery): Battery     //     because nc battery class already created the constructor of battery
    }

//}