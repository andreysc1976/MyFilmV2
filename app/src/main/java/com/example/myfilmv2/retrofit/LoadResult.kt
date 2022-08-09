package com.example.myfilmv2.retrofit

import androidx.lifecycle.MutableLiveData
import com.example.myfilmv2.MovieListResultObject

sealed interface LoadResult{
    data class Success(val data:MutableLiveData<List<MovieListResultObject>>)
}