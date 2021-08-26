package com.ams.movieapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.ams.movieapp.core.domain.usecase.MovieUseCase

class HomeViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val movie = movieUseCase.getAllMovie().asLiveData()
}