package com.example.myfilmv2

import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofitModule = module{
    single{providerRetrofit()}
}

fun providerRetrofit():Retrofit{
    return Retrofit.Builder()
        .baseUrl(BuildConfig.API_KEY)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}