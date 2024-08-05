package com.devgoder.rickandmortyapi.repository

import com.devgoder.rickandmortyapi.api.PersonajesApi
import com.devgoder.rickandmortyapi.model.ListaPersonajes
import javax.inject.Inject

class PersonajesRepository @Inject constructor(
    private val personajesApi: PersonajesApi
) {
    suspend fun getPersonajes() : ListaPersonajes {
        return personajesApi.getPersonajes()
    }
}