package com.example.myfilmv2.retrofit

import android.arch.paging.PageKeyedDataSource
import com.example.myfilmv2.MovieListResultObject
import kotlinx.coroutines.*
import org.koin.java.KoinJavaComponent
import kotlin.coroutines.CoroutineContext

class MovieListDataSource : PageKeyedDataSource<Int, MovieListResultObject>(),CoroutineScope {

    val repo:TMDBRepository = KoinJavaComponent.getKoin().get()

    private val job = Job()
    val coroutineScope = CoroutineScope(coroutineContext+job)

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, MovieListResultObject>
    ) {
        coroutineScope.launch {
            val rez = repo.getTopRated(1)
        }
    }

    override fun loadBefore(
        params: LoadParams<Int>,
        callback: LoadCallback<Int, MovieListResultObject>
    ) {
        TODO("Not yet implemented")
    }

    override fun loadAfter(
        params: LoadParams<Int>,
        callback: LoadCallback<Int, MovieListResultObject>
    ) {
        coroutineScope.launch {

        }
    }

    override val coroutineContext: CoroutineContext
        get() = SupervisorJob() + Dispatchers.IO
}