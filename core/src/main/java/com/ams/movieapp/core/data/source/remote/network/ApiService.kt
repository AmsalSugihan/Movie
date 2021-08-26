package com.ams.movieapp.core.data.source.remote.network

import com.ams.movieapp.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String?, @Query("language") language: String?,
        @Query("page") page: Int
    ): ListMovieResponse

}