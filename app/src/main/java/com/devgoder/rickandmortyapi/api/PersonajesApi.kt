package com.devgoder.rickandmortyapi.api

import com.devgoder.rickandmortyapi.model.ListaPersonajes
import retrofit2.http.GET

interface PersonajesApi {
    @GET("character")
    suspend fun getPersonajes(): ListaPersonajes
}