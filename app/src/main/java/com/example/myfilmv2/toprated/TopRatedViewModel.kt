package com.example.myfilmv2.toprated

import android.arch.paging.PagedList
import androidx.lifecycle.ViewModel
import com.example.myfilmv2.MovieListResultObject
import com.example.myfilmv2.retrofit.MovieListDataSource
import com.example.myfilmv2.retrofit.TMDBRepository


class TopRatedViewModel(private val novieRepo:TMDBRepository) : ViewModel() {

    private lateinit var pageList:PagedList<MovieListResultObject>
    private val dataSource = MovieListDataSource()

    init{
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .build()
        pageList = PagedList.Builder<MovieListResultObject>(dataSource,config)

    }
}