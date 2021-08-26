package com.ams.movieapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.ams.movieapp.core.domain.usecase.MovieUseCase

class FavoriteActivityViewModel (movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovie = movieUseCase.getFavoriteMovie().asLiveData()
}