package com.example.myfilmv2.retrofit

import androidx.lifecycle.MutableLiveData
import com.example.myfilmv2.MovieListResultObject
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiDAO {
    @GET("/movie/top_rated")
    suspend fun topRated(@Query("Language") language:String,@Query("page") page:Int=1):MutableLiveData<List<MovieListResultObject>>
}