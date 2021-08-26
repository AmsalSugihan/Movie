package com.ams.movieapp.di

import com.ams.movieapp.core.domain.usecase.MovieInteractor
import com.ams.movieapp.core.domain.usecase.MovieUseCase
import com.ams.movieapp.detail.DetailMovieViewModel
import com.ams.movieapp.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}