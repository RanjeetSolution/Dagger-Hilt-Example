package com.example.daggerhilt1.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

class Main2 @Inject constructor(
    @FName
    private val fName: String,
    @LName
    private val lName: String
){

    fun getName(){
        Log.d("Main", "My name is $fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class ModuleApp{

    @Provides
    @FName
    fun getFName():String = "Ranjit"

    @Provides
    @LName
    fun getLName():String = "Yadav"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName
