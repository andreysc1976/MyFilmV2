package com.example.myfilmv2.toprated

import android.arch.paging.PagedListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfilmv2.MovieListResultObject
import com.example.myfilmv2.R

class PagedTopRatedAdapter:
    PagedListAdapter<MovieListResultObject, PagedTopRatedAdapter.MovieHolder>(MovieListCallback) {

    class MovieHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.film_holder,parent,false)
        return  MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return super.getItemCount()
    }

    companion object {
        val MovieListCallback = object: DiffUtil.ItemCallback<MovieListResultObject>(){
            override fun areItemsTheSame(
                oldItem: MovieListResultObject,
                newItem: MovieListResultObject
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: MovieListResultObject,
                newItem: MovieListResultObject
            ): Boolean {
                return oldItem==newItem
            }

        }
    }
}