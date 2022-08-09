package com.example.myfilmv2.retrofit

class TMDBRepository(private val api:ApiDAO) {
    suspend fun getTopRated(page:Int) = api.topRated("ru-RU",page)
}