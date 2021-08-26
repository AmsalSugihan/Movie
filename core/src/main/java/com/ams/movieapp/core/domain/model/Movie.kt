package com.ams.movieapp.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie(
    val movieId: Int,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val image: String,
    val isFavorite: Boolean
) : Parcelable