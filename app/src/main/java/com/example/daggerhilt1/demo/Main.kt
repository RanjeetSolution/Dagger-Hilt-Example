package com.example.daggerhilt1.demo

import android.app.Application
import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface One{
    fun getName()
}

class ImplementOne @Inject constructor(private val name: String) : One{
    override fun getName() {
        Log.d("Main", "My name is $name ")
    }

}

class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getName()
    }
}

/*
Most Uses 1st Way
 */
/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule{

    @Binds
    @Singleton
    abstract fun binding(implementOne: ImplementOne) : One

}*/

/*
2nd Way but not most uses
 */
@Module
@InstallIn(SingletonComponent::class)
class AppModule{

    @Provides
    @Singleton
    fun getName(): String = "Ranit Yadav"

    @Provides
    @Singleton
    fun binding(name: String):One = ImplementOne(name)
}
