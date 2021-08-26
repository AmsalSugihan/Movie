package com.ams.movieapp.core.utils

import com.ams.movieapp.core.data.source.local.entity.MovieEntity
import com.ams.movieapp.core.data.source.remote.response.MovieResponse
import com.ams.movieapp.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                overview = it.overview,
                title = it.title,
                image = "https://image.tmdb.org/t/p/w185/" + it.posterPath,
                releaseDate = it.releaseDate,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                overview = it.overview,
                title = it.title,
                releaseDate = it.releaseDate,
                image = it.image,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) =
        MovieEntity(
            movieId = input.movieId,
            overview = input.overview,
            title = input.title,
            releaseDate = input.releaseDate,
            image = input.image,
            isFavorite = input.isFavorite
        )
}