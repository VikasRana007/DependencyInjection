package com.learning.dependencyinjection

import dagger.Component

@Component(modules = [MemoryCardModule::class])         // Now to Generate dagger related classes, let's rebuild the project
interface SmartPhoneComponent {
        // write an abstract function return type of the function must be same as you required dependency name
        // when generating for dependency injection dagger will only consider this return type
    fun getSmartPhone() : SmartPhone

}