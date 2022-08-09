package com.example.myfilmv2.koin_modules

import com.example.myfilmv2.toprated.TopRatedViewModel
import org.koin.dsl.module


val viewModelModule = module{
    factory { TopRatedViewModel(get())}
}