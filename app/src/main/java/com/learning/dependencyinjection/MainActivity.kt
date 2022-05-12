package com.learning.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        we did not construct any dependency inside the main activity , instead we
//        constructed them out side and injected them to the main activity with the support of Dagger2
//        always remember to use @Inject annotation for all the constructor of the and remember to use a component interface
//        annotated with component annotation to tell dagger to construct those dependency...

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()                                  // this will inject a smartPhone instance
            .makeACAllWithRecording()                         // invoke smart phone using make a call to the calling function

        /**
         * val smartPhone = SmartPhone(
         * Battery(),
         * SIMCard(ServiceProvider())
         * MemoryCard()
         * )
         * .makeCallWithRecording()
         */
    }
}